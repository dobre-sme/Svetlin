package com.http;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HttpParserTest {

    private HttpParser httpParser;
    

    //@BeforeAll is used to signal that the
    // annotated method should be executed before all tests in current test the  class:

    @BeforeAll
    public void beforeClass(){
        httpParser = new HttpParser();

    }

    @Test
    void parseHttpRequest() {
        HttpRequest request = null;
        try {
            request = httpParser.parseHttpRequest(
                    generateValidGETTestCase()
            );
        } catch (HttpParsingException e) {
            fail(e);
        }

        assertNotNull(request);
        assertEquals(request.getMethod(), HttpMethod.GET);
        assertEquals(request.getRequestTarget(),"/");
        assertEquals(request.getOriginalHttpVersion(),"HTTP/1.2");
        assertEquals(request.getBestCompatibleHttpVersion(),HttpVersion.HTTP_1_1);
    }

    @Test
    void parseHttpRequestBadMethod1() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadTestCaseMethodName1()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode(), HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED);
        }

    }

    @Test
    void parseHttpRequestBadMethod2() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadTestCaseMethodName2()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode(), HttpStatusCode.SERVER_ERROR_501_NOT_IMPLEMENTED);
        }

    }

    @Test
    void parseHttpRequestInvNumItems1() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadTestCaseRequestInvNumItems1()
            );
            fail();
        } catch (HttpParsingException e) {
             assertEquals(e.getErrorCode() , HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST);
        }

    }

    @Test
    void parseHttpEmptyRequestLine() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadTestCaseEmptyRequestLine()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode() , HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST);
        }

    }

    @Test
    void parseHttpRequestLineCRnoLF() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadTestCaseRequestOnlyCRnoLF()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode() , HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST);
        }

    }

    @Test
    void parseHttpRequestBadHttpVersion() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateBadHttpVersionTestCase()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode(), HttpStatusCode.CLIENT_ERROR_400_BAD_REQUEST);
        }

    }

    @Test
    void parseHttpRequestUnsupportedHttpVersion() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateUnsupportedHttpVersionTestCase()
            );
            fail();
        } catch (HttpParsingException e) {
            assertEquals(e.getErrorCode(), HttpStatusCode.SERVER_ERROR_505_HTTP_VERSION_NOT_SUPPORTED);
        }

    }

    @Test
    void parseHttpRequestSupportedHttpVersion() {
        try {
            HttpRequest request = httpParser.parseHttpRequest(
                    generateSupportedHttpVersion()
            );
            assertNotNull(request);
            assertEquals(request.getBestCompatibleHttpVersion(), HttpVersion.HTTP_1_1);
            assertEquals(request.getOriginalHttpVersion(),"HTTP/1.2");
        } catch (HttpParsingException e) {
            fail();
        }

    }

    private InputStream generateValidGETTestCase(){
        String rawData = "GET / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Connection: keep-alive\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "sec-ch-ua: \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"\r\n" +
                "sec-ch-ua-mobile: ?0\r\n" +
                "sec-ch-ua-platform: \"Windows\"\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Sec-Fetch-Site: none\r\n" +
                "Sec-Fetch-Mode: navigate\r\n" +
                "Sec-Fetch-User: ?1\r\n" +
                "Sec-Fetch-Dest: document\r\n" +
                "Accept-Encoding: gzip, deflate, br\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadTestCaseMethodName1(){
        String rawData = "GeT / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadTestCaseMethodName2(){
        String rawData = "GETTTT / HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadTestCaseRequestInvNumItems1(){
        String rawData = "GET / AAAAAAA HTTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadTestCaseEmptyRequestLine(){
        String rawData = "\r\n" +
                "Host: localhost:8080\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadTestCaseRequestOnlyCRnoLF(){
        String rawData = "GET / HTTP/1.1\r" + // <-- No LF
                "Host: localhost:8080\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateBadHttpVersionTestCase(){
        String rawData = "GET / HTP/1.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Connection: keep-alive\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "sec-ch-ua: \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"\r\n" +
                "sec-ch-ua-mobile: ?0\r\n" +
                "sec-ch-ua-platform: \"Windows\"\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Sec-Fetch-Site: none\r\n" +
                "Sec-Fetch-Mode: navigate\r\n" +
                "Sec-Fetch-User: ?1\r\n" +
                "Sec-Fetch-Dest: document\r\n" +
                "Accept-Encoding: gzip, deflate, br\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateUnsupportedHttpVersionTestCase(){
        String rawData = "GET / HTTP/2.1\r\n" +
                "Host: localhost:8080\r\n" +
                "Connection: keep-alive\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "sec-ch-ua: \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"\r\n" +
                "sec-ch-ua-mobile: ?0\r\n" +
                "sec-ch-ua-platform: \"Windows\"\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Sec-Fetch-Site: none\r\n" +
                "Sec-Fetch-Mode: navigate\r\n" +
                "Sec-Fetch-User: ?1\r\n" +
                "Sec-Fetch-Dest: document\r\n" +
                "Accept-Encoding: gzip, deflate, br\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

    private InputStream generateSupportedHttpVersion(){
        String rawData = "GET / HTTP/1.2\r\n" +
                "Host: localhost:8080\r\n" +
                "Connection: keep-alive\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "sec-ch-ua: \" Not A;Brand\";v=\"99\", \"Chromium\";v=\"99\", \"Google Chrome\";v=\"99\"\r\n" +
                "sec-ch-ua-mobile: ?0\r\n" +
                "sec-ch-ua-platform: \"Windows\"\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.74 Safari/537.36\r\n" +
                "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Sec-Fetch-Site: none\r\n" +
                "Sec-Fetch-Mode: navigate\r\n" +
                "Sec-Fetch-User: ?1\r\n" +
                "Sec-Fetch-Dest: document\r\n" +
                "Accept-Encoding: gzip, deflate, br\r\n" +
                "Accept-Language: bg-BG,bg;q=0.9,en;q=0.8" +
                "\r\n";

        InputStream inputStream = new ByteArrayInputStream(
                rawData.getBytes(
                        StandardCharsets.US_ASCII
                )
        );
        return inputStream;
    }

}