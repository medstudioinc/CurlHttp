package com.ningso.libcurl.generates;

import java.util.HashMap;

/**
 * Created by NingSo on 16/3/12.下午5:34
 * Auto generated from 'curl/curl.h', DO NOT EDIT!!!
 *
 * @author: NingSo
 * @Email: ningso.ping@gmail.com
 */
public enum CurlCode {
    CURLE_OK(0), //
    CURLE_UNSUPPORTED_PROTOCOL(1), //
    CURLE_FAILED_INIT(2), //
    CURLE_URL_MALFORMAT(3), //该网址的格式不正确
    CURLE_NOT_BUILT_IN(4), //
    CURLE_COULDNT_RESOLVE_PROXY(5), //
    CURLE_COULDNT_RESOLVE_HOST(6), //无法解析主机。给定的远程主机没有得到解决
    CURLE_COULDNT_CONNECT(7), //连接的的主机或代理失败
    CURLE_FTP_WEIRD_SERVER_REPLY(8), //
    CURLE_REMOTE_ACCESS_DENIED(9), //
    CURLE_FTP_ACCEPT_FAILED(10), //
    CURLE_FTP_WEIRD_PASS_REPLY(11), //
    CURLE_FTP_ACCEPT_TIMEOUT(12), //
    CURLE_FTP_WEIRD_PASV_REPLY(13), //
    CURLE_FTP_WEIRD_227_FORMAT(14), //
    CURLE_FTP_CANT_GET_HOST(15), //
    CURLE_HTTP2(16), //
    CURLE_FTP_COULDNT_SET_TYPE(17), //
    CURLE_PARTIAL_FILE(18), //
    CURLE_FTP_COULDNT_RETR_FILE(19), //
    CURLE_OBSOLETE20(20), //
    CURLE_QUOTE_ERROR(21), //
    CURLE_HTTP_RETURNED_ERROR(22), //
    CURLE_WRITE_ERROR(23), //
    CURLE_OBSOLETE24(24), //
    CURLE_UPLOAD_FAILED(25), //
    CURLE_READ_ERROR(26), //
    CURLE_OUT_OF_MEMORY(27), //
    CURLE_OPERATION_TIMEDOUT(28), //
    CURLE_OBSOLETE29(29), //
    CURLE_FTP_PORT_FAILED(30), //
    CURLE_FTP_COULDNT_USE_REST(31), //
    CURLE_OBSOLETE32(32), //
    CURLE_RANGE_ERROR(33), //
    CURLE_HTTP_POST_ERROR(34), //
    CURLE_SSL_CONNECT_ERROR(35), //
    CURLE_BAD_DOWNLOAD_RESUME(36), //
    CURLE_FILE_COULDNT_READ_FILE(37), //
    CURLE_LDAP_CANNOT_BIND(38), //
    CURLE_LDAP_SEARCH_FAILED(39), //
    CURLE_OBSOLETE40(40), //
    CURLE_FUNCTION_NOT_FOUND(41), //
    CURLE_ABORTED_BY_CALLBACK(42), //
    CURLE_BAD_FUNCTION_ARGUMENT(43), //
    CURLE_OBSOLETE44(44), //
    CURLE_INTERFACE_FAILED(45), //
    CURLE_OBSOLETE46(46), //
    CURLE_UNKNOWN_OPTION(47), //
    CURLE_OBSOLETE50(48), //
    CURLE_PEER_FAILED_VERIFICATION(49), //
    CURLE_GOT_NOTHING(50), //
    CURLE_SSL_ENGINE_NOTFOUND(51), //
    CURLE_SSL_ENGINE_SETFAILED(52), //
    CURLE_SEND_ERROR(53), //
    CURLE_RECV_ERROR(54), //
    CURLE_OBSOLETE57(55), //
    CURLE_SSL_CERTPROBLEM(56), //
    CURLE_SSL_CIPHER(57), //
    CURLE_SSL_CACERT(58), //
    CURLE_BAD_CONTENT_ENCODING(59), //
    CURLE_LDAP_INVALID_URL(60), //
    CURLE_FILESIZE_EXCEEDED(61), //
    CURLE_USE_SSL_FAILED(62), //
    CURLE_SEND_FAIL_REWIND(63), //
    CURLE_SSL_ENGINE_INITFAILED(64), //
    CURLE_LOGIN_DENIED(65), //
    CURLE_TFTP_NOTFOUND(66), //
    CURLE_TFTP_PERM(67), //
    CURLE_REMOTE_DISK_FULL(68), //
    CURLE_TFTP_ILLEGAL(69), //
    CURLE_TFTP_UNKNOWNID(70), //
    CURLE_REMOTE_FILE_EXISTS(71), //
    CURLE_TFTP_NOSUCHUSER(72), //
    CURLE_CONV_FAILED(73), //
    CURLE_CONV_REQD(74), //
    CURLE_SSL_CACERT_BADFILE(75), //
    CURLE_REMOTE_FILE_NOT_FOUND(76), //
    CURLE_SSH(77), //
    CURLE_SSL_SHUTDOWN_FAILED(78), //
    CURLE_AGAIN(79), //
    CURLE_SSL_CRL_BADFILE(80), //
    CURLE_SSL_ISSUER_ERROR(81), //
    CURLE_FTP_PRET_FAILED(82), //
    CURLE_RTSP_CSEQ_ERROR(83), //
    CURLE_RTSP_SESSION_ERROR(84), //
    CURLE_FTP_BAD_FILE_LIST(85), //
    CURLE_CHUNK_FAILED(86), //
    CURLE_NO_CONNECTION_AVAILABLE(87), //
    CURLE_SSL_PINNEDPUBKEYNOTMATCH(88);

    private final int value;

    private static HashMap<Integer, CurlCode> valuesMap = new HashMap<>();

    static {
        for (CurlCode e : values()) {
            valuesMap.put(e.getValue(), e);
        }
    }

    CurlCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CurlCode fromValue(int value) {
        return valuesMap.get(value);
    }
}