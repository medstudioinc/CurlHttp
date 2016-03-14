package com.ningso.libcurl.generates;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by NingSo on 16/3/12.下午5:31
 * Auto generated from 'curl/curl.h', DO NOT EDIT!!!
 *
 * @author: NingSo
 */
public abstract class CurlConstant {

    private CurlConstant() {
    }

    private static Set<Integer> LONG_OPT_SET = new HashSet<>();

    private static Set<Integer> OBJECT_POINT_OPT_SET = new HashSet<>();

    private static Set<Integer> FUNCTION_POINT_OPT_SET = new HashSet<>();

    public static int CURLOPTTYPE_LONG = 0;

    public static int CURLOPTTYPE_OBJECTPOINT = 10000;

    public static int CURLOPTTYPE_FUNCTIONPOINT = 20000;

    public static int CURLOPTTYPE_OFF_T = 30000;

    public static int CURLOPT_WRITEDATA = CURLOPTTYPE_OBJECTPOINT + 1;

    public static int CURLOPT_URL = CURLOPTTYPE_OBJECTPOINT + 2;

    public static int CURLOPT_PORT = CURLOPTTYPE_LONG + 3;

    public static int CURLOPT_PROXY = CURLOPTTYPE_OBJECTPOINT + 4;

    public static int CURLOPT_USERPWD = CURLOPTTYPE_OBJECTPOINT + 5;

    public static int CURLOPT_PROXYUSERPWD = CURLOPTTYPE_OBJECTPOINT + 6;

    public static int CURLOPT_RANGE = CURLOPTTYPE_OBJECTPOINT + 7;

    public static int CURLOPT_READDATA = CURLOPTTYPE_OBJECTPOINT + 9;

    public static int CURLOPT_ERRORBUFFER = CURLOPTTYPE_OBJECTPOINT + 10;

    public static int CURLOPT_WRITEFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 11;

    public static int CURLOPT_READFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 12;

    public static int CURLOPT_TIMEOUT = CURLOPTTYPE_LONG + 13;

    public static int CURLOPT_INFILESIZE = CURLOPTTYPE_LONG + 14;

    public static int CURLOPT_POSTFIELDS = CURLOPTTYPE_OBJECTPOINT + 15;

    public static int CURLOPT_REFERER = CURLOPTTYPE_OBJECTPOINT + 16;

    public static int CURLOPT_FTPPORT = CURLOPTTYPE_OBJECTPOINT + 17;

    public static int CURLOPT_USERAGENT = CURLOPTTYPE_OBJECTPOINT + 18;

    public static int CURLOPT_LOW_SPEED_LIMIT = CURLOPTTYPE_LONG + 19;

    public static int CURLOPT_LOW_SPEED_TIME = CURLOPTTYPE_LONG + 20;

    public static int CURLOPT_RESUME_FROM = CURLOPTTYPE_LONG + 21;

    public static int CURLOPT_COOKIE = CURLOPTTYPE_OBJECTPOINT + 22;

    public static int CURLOPT_HTTPHEADER = CURLOPTTYPE_OBJECTPOINT + 23;

    public static int CURLOPT_HTTPPOST = CURLOPTTYPE_OBJECTPOINT + 24;

    public static int CURLOPT_SSLCERT = CURLOPTTYPE_OBJECTPOINT + 25;

    public static int CURLOPT_KEYPASSWD = CURLOPTTYPE_OBJECTPOINT + 26;

    public static int CURLOPT_CRLF = CURLOPTTYPE_LONG + 27;

    public static int CURLOPT_QUOTE = CURLOPTTYPE_OBJECTPOINT + 28;

    public static int CURLOPT_HEADERDATA = CURLOPTTYPE_OBJECTPOINT + 29;

    public static int CURLOPT_COOKIEFILE = CURLOPTTYPE_OBJECTPOINT + 31;

    public static int CURLOPT_SSLVERSION = CURLOPTTYPE_LONG + 32;

    public static int CURLOPT_TIMECONDITION = CURLOPTTYPE_LONG + 33;

    public static int CURLOPT_TIMEVALUE = CURLOPTTYPE_LONG + 34;

    public static int CURLOPT_CUSTOMREQUEST = CURLOPTTYPE_OBJECTPOINT + 36;

    public static int CURLOPT_STDERR = CURLOPTTYPE_OBJECTPOINT + 37;

    public static int CURLOPT_POSTQUOTE = CURLOPTTYPE_OBJECTPOINT + 39;

    public static int CURLOPT_OBSOLETE40 = CURLOPTTYPE_OBJECTPOINT + 40;

    public static int CURLOPT_VERBOSE = CURLOPTTYPE_LONG + 41;

    public static int CURLOPT_HEADER = CURLOPTTYPE_LONG + 42;

    public static int CURLOPT_NOPROGRESS = CURLOPTTYPE_LONG + 43;

    public static int CURLOPT_NOBODY = CURLOPTTYPE_LONG + 44;

    public static int CURLOPT_FAILONERROR = CURLOPTTYPE_LONG + 45;

    public static int CURLOPT_UPLOAD = CURLOPTTYPE_LONG + 46;

    public static int CURLOPT_POST = CURLOPTTYPE_LONG + 47;

    public static int CURLOPT_DIRLISTONLY = CURLOPTTYPE_LONG + 48;

    public static int CURLOPT_APPEND = CURLOPTTYPE_LONG + 50;

    public static int CURLOPT_NETRC = CURLOPTTYPE_LONG + 51;

    public static int CURLOPT_FOLLOWLOCATION = CURLOPTTYPE_LONG + 52;

    public static int CURLOPT_TRANSFERTEXT = CURLOPTTYPE_LONG + 53;

    public static int CURLOPT_PUT = CURLOPTTYPE_LONG + 54;

    public static int CURLOPT_PROGRESSFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 56;

    public static int CURLOPT_PROGRESSDATA = CURLOPTTYPE_OBJECTPOINT + 57;

    public static int CURLOPT_AUTOREFERER = CURLOPTTYPE_LONG + 58;

    public static int CURLOPT_PROXYPORT = CURLOPTTYPE_LONG + 59;

    public static int CURLOPT_POSTFIELDSIZE = CURLOPTTYPE_LONG + 60;

    public static int CURLOPT_HTTPPROXYTUNNEL = CURLOPTTYPE_LONG + 61;

    public static int CURLOPT_INTERFACE = CURLOPTTYPE_OBJECTPOINT + 62;

    public static int CURLOPT_KRBLEVEL = CURLOPTTYPE_OBJECTPOINT + 63;

    public static int CURLOPT_SSL_VERIFYPEER = CURLOPTTYPE_LONG + 64;

    public static int CURLOPT_CAINFO = CURLOPTTYPE_OBJECTPOINT + 65;

    public static int CURLOPT_MAXREDIRS = CURLOPTTYPE_LONG + 68;

    public static int CURLOPT_FILETIME = CURLOPTTYPE_LONG + 69;

    public static int CURLOPT_TELNETOPTIONS = CURLOPTTYPE_OBJECTPOINT + 70;

    public static int CURLOPT_MAXCONNECTS = CURLOPTTYPE_LONG + 71;

    public static int CURLOPT_OBSOLETE72 = CURLOPTTYPE_LONG + 72;

    public static int CURLOPT_FRESH_CONNECT = CURLOPTTYPE_LONG + 74;

    public static int CURLOPT_FORBID_REUSE = CURLOPTTYPE_LONG + 75;

    public static int CURLOPT_RANDOM_FILE = CURLOPTTYPE_OBJECTPOINT + 76;

    public static int CURLOPT_EGDSOCKET = CURLOPTTYPE_OBJECTPOINT + 77;

    public static int CURLOPT_CONNECTTIMEOUT = CURLOPTTYPE_LONG + 78;

    public static int CURLOPT_HEADERFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 79;

    public static int CURLOPT_HTTPGET = CURLOPTTYPE_LONG + 80;

    public static int CURLOPT_SSL_VERIFYHOST = CURLOPTTYPE_LONG + 81;

    public static int CURLOPT_COOKIEJAR = CURLOPTTYPE_OBJECTPOINT + 82;

    public static int CURLOPT_SSL_CIPHER_LIST = CURLOPTTYPE_OBJECTPOINT + 83;

    public static int CURLOPT_HTTP_VERSION = CURLOPTTYPE_LONG + 84;

    public static int CURLOPT_FTP_USE_EPSV = CURLOPTTYPE_LONG + 85;

    public static int CURLOPT_SSLCERTTYPE = CURLOPTTYPE_OBJECTPOINT + 86;

    public static int CURLOPT_SSLKEY = CURLOPTTYPE_OBJECTPOINT + 87;

    public static int CURLOPT_SSLKEYTYPE = CURLOPTTYPE_OBJECTPOINT + 88;

    public static int CURLOPT_SSLENGINE = CURLOPTTYPE_OBJECTPOINT + 89;

    public static int CURLOPT_SSLENGINE_DEFAULT = CURLOPTTYPE_LONG + 90;

    public static int CURLOPT_DNS_USE_GLOBAL_CACHE = CURLOPTTYPE_LONG + 91;

    public static int CURLOPT_DNS_CACHE_TIMEOUT = CURLOPTTYPE_LONG + 92;

    public static int CURLOPT_PREQUOTE = CURLOPTTYPE_OBJECTPOINT + 93;

    public static int CURLOPT_DEBUGFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 94;

    public static int CURLOPT_DEBUGDATA = CURLOPTTYPE_OBJECTPOINT + 95;

    public static int CURLOPT_COOKIESESSION = CURLOPTTYPE_LONG + 96;

    public static int CURLOPT_CAPATH = CURLOPTTYPE_OBJECTPOINT + 97;

    public static int CURLOPT_BUFFERSIZE = CURLOPTTYPE_LONG + 98;

    public static int CURLOPT_NOSIGNAL = CURLOPTTYPE_LONG + 99;

    public static int CURLOPT_SHARE = CURLOPTTYPE_OBJECTPOINT + 100;

    public static int CURLOPT_PROXYTYPE = CURLOPTTYPE_LONG + 101;

    public static int CURLOPT_ACCEPT_ENCODING = CURLOPTTYPE_OBJECTPOINT + 102;

    public static int CURLOPT_PRIVATE = CURLOPTTYPE_OBJECTPOINT + 103;

    public static int CURLOPT_HTTP200ALIASES = CURLOPTTYPE_OBJECTPOINT + 104;

    public static int CURLOPT_UNRESTRICTED_AUTH = CURLOPTTYPE_LONG + 105;

    public static int CURLOPT_FTP_USE_EPRT = CURLOPTTYPE_LONG + 106;

    public static int CURLOPT_HTTPAUTH = CURLOPTTYPE_LONG + 107;

    public static int CURLOPT_SSL_CTX_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 108;

    public static int CURLOPT_SSL_CTX_DATA = CURLOPTTYPE_OBJECTPOINT + 109;

    public static int CURLOPT_FTP_CREATE_MISSING_DIRS = CURLOPTTYPE_LONG + 110;

    public static int CURLOPT_PROXYAUTH = CURLOPTTYPE_LONG + 111;

    public static int CURLOPT_FTP_RESPONSE_TIMEOUT = CURLOPTTYPE_LONG + 112;

    public static int CURLOPT_IPRESOLVE = CURLOPTTYPE_LONG + 113;

    public static int CURLOPT_MAXFILESIZE = CURLOPTTYPE_LONG + 114;

    public static int CURLOPT_INFILESIZE_LARGE = CURLOPTTYPE_OFF_T + 115;

    public static int CURLOPT_RESUME_FROM_LARGE = CURLOPTTYPE_OFF_T + 116;

    public static int CURLOPT_MAXFILESIZE_LARGE = CURLOPTTYPE_OFF_T + 117;

    public static int CURLOPT_NETRC_FILE = CURLOPTTYPE_OBJECTPOINT + 118;

    public static int CURLOPT_USE_SSL = CURLOPTTYPE_LONG + 119;

    public static int CURLOPT_POSTFIELDSIZE_LARGE = CURLOPTTYPE_OFF_T + 120;

    public static int CURLOPT_TCP_NODELAY = CURLOPTTYPE_LONG + 121;

    public static int CURLOPT_FTPSSLAUTH = CURLOPTTYPE_LONG + 129;

    public static int CURLOPT_IOCTLFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 130;

    public static int CURLOPT_IOCTLDATA = CURLOPTTYPE_OBJECTPOINT + 131;

    public static int CURLOPT_FTP_ACCOUNT = CURLOPTTYPE_OBJECTPOINT + 134;

    public static int CURLOPT_COOKIELIST = CURLOPTTYPE_OBJECTPOINT + 135;

    public static int CURLOPT_IGNORE_CONTENT_LENGTH = CURLOPTTYPE_LONG + 136;

    public static int CURLOPT_FTP_SKIP_PASV_IP = CURLOPTTYPE_LONG + 137;

    public static int CURLOPT_FTP_FILEMETHOD = CURLOPTTYPE_LONG + 138;

    public static int CURLOPT_LOCALPORT = CURLOPTTYPE_LONG + 139;

    public static int CURLOPT_LOCALPORTRANGE = CURLOPTTYPE_LONG + 140;

    public static int CURLOPT_CONNECT_ONLY = CURLOPTTYPE_LONG + 141;

    public static int CURLOPT_CONV_FROM_NETWORK_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 142;

    public static int CURLOPT_CONV_TO_NETWORK_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 143;

    public static int CURLOPT_CONV_FROM_UTF8_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 144;

    public static int CURLOPT_MAX_SEND_SPEED_LARGE = CURLOPTTYPE_OFF_T + 145;

    public static int CURLOPT_MAX_RECV_SPEED_LARGE = CURLOPTTYPE_OFF_T + 146;

    public static int CURLOPT_FTP_ALTERNATIVE_TO_USER = CURLOPTTYPE_OBJECTPOINT + 147;

    public static int CURLOPT_SOCKOPTFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 148;

    public static int CURLOPT_SOCKOPTDATA = CURLOPTTYPE_OBJECTPOINT + 149;

    public static int CURLOPT_SSL_SESSIONID_CACHE = CURLOPTTYPE_LONG + 150;

    public static int CURLOPT_SSH_AUTH_TYPES = CURLOPTTYPE_LONG + 151;

    public static int CURLOPT_SSH_PUBLIC_KEYFILE = CURLOPTTYPE_OBJECTPOINT + 152;

    public static int CURLOPT_SSH_PRIVATE_KEYFILE = CURLOPTTYPE_OBJECTPOINT + 153;

    public static int CURLOPT_FTP_SSL_CCC = CURLOPTTYPE_LONG + 154;

    public static int CURLOPT_TIMEOUT_MS = CURLOPTTYPE_LONG + 155;

    public static int CURLOPT_CONNECTTIMEOUT_MS = CURLOPTTYPE_LONG + 156;

    public static int CURLOPT_HTTP_TRANSFER_DECODING = CURLOPTTYPE_LONG + 157;

    public static int CURLOPT_HTTP_CONTENT_DECODING = CURLOPTTYPE_LONG + 158;

    public static int CURLOPT_NEW_FILE_PERMS = CURLOPTTYPE_LONG + 159;

    public static int CURLOPT_NEW_DIRECTORY_PERMS = CURLOPTTYPE_LONG + 160;

    public static int CURLOPT_POSTREDIR = CURLOPTTYPE_LONG + 161;

    public static int CURLOPT_SSH_HOST_PUBLIC_KEY_MD5 = CURLOPTTYPE_OBJECTPOINT + 162;

    public static int CURLOPT_OPENSOCKETFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 163;

    public static int CURLOPT_OPENSOCKETDATA = CURLOPTTYPE_OBJECTPOINT + 164;

    public static int CURLOPT_COPYPOSTFIELDS = CURLOPTTYPE_OBJECTPOINT + 165;

    public static int CURLOPT_PROXY_TRANSFER_MODE = CURLOPTTYPE_LONG + 166;

    public static int CURLOPT_SEEKFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 167;

    public static int CURLOPT_SEEKDATA = CURLOPTTYPE_OBJECTPOINT + 168;

    public static int CURLOPT_CRLFILE = CURLOPTTYPE_OBJECTPOINT + 169;

    public static int CURLOPT_ISSUERCERT = CURLOPTTYPE_OBJECTPOINT + 170;

    public static int CURLOPT_ADDRESS_SCOPE = CURLOPTTYPE_LONG + 171;

    public static int CURLOPT_CERTINFO = CURLOPTTYPE_LONG + 172;

    public static int CURLOPT_USERNAME = CURLOPTTYPE_OBJECTPOINT + 173;

    public static int CURLOPT_PASSWORD = CURLOPTTYPE_OBJECTPOINT + 174;

    public static int CURLOPT_PROXYUSERNAME = CURLOPTTYPE_OBJECTPOINT + 175;

    public static int CURLOPT_PROXYPASSWORD = CURLOPTTYPE_OBJECTPOINT + 176;

    public static int CURLOPT_NOPROXY = CURLOPTTYPE_OBJECTPOINT + 177;

    public static int CURLOPT_TFTP_BLKSIZE = CURLOPTTYPE_LONG + 178;

    public static int CURLOPT_SOCKS5_GSSAPI_SERVICE = CURLOPTTYPE_OBJECTPOINT + 179;

    public static int CURLOPT_SOCKS5_GSSAPI_NEC = CURLOPTTYPE_LONG + 180;

    public static int CURLOPT_PROTOCOLS = CURLOPTTYPE_LONG + 181;

    public static int CURLOPT_REDIR_PROTOCOLS = CURLOPTTYPE_LONG + 182;

    public static int CURLOPT_SSH_KNOWNHOSTS = CURLOPTTYPE_OBJECTPOINT + 183;

    public static int CURLOPT_SSH_KEYFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 184;

    public static int CURLOPT_SSH_KEYDATA = CURLOPTTYPE_OBJECTPOINT + 185;

    public static int CURLOPT_MAIL_FROM = CURLOPTTYPE_OBJECTPOINT + 186;

    public static int CURLOPT_MAIL_RCPT = CURLOPTTYPE_OBJECTPOINT + 187;

    public static int CURLOPT_FTP_USE_PRET = CURLOPTTYPE_LONG + 188;

    public static int CURLOPT_RTSP_REQUEST = CURLOPTTYPE_LONG + 189;

    public static int CURLOPT_RTSP_SESSION_ID = CURLOPTTYPE_OBJECTPOINT + 190;

    public static int CURLOPT_RTSP_STREAM_URI = CURLOPTTYPE_OBJECTPOINT + 191;

    public static int CURLOPT_RTSP_TRANSPORT = CURLOPTTYPE_OBJECTPOINT + 192;

    public static int CURLOPT_RTSP_CLIENT_CSEQ = CURLOPTTYPE_LONG + 193;

    public static int CURLOPT_RTSP_SERVER_CSEQ = CURLOPTTYPE_LONG + 194;

    public static int CURLOPT_INTERLEAVEDATA = CURLOPTTYPE_OBJECTPOINT + 195;

    public static int CURLOPT_INTERLEAVEFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 196;

    public static int CURLOPT_WILDCARDMATCH = CURLOPTTYPE_LONG + 197;

    public static int CURLOPT_CHUNK_BGN_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 198;

    public static int CURLOPT_CHUNK_END_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 199;

    public static int CURLOPT_FNMATCH_FUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 200;

    public static int CURLOPT_CHUNK_DATA = CURLOPTTYPE_OBJECTPOINT + 201;

    public static int CURLOPT_FNMATCH_DATA = CURLOPTTYPE_OBJECTPOINT + 202;

    public static int CURLOPT_RESOLVE = CURLOPTTYPE_OBJECTPOINT + 203;

    public static int CURLOPT_TLSAUTH_USERNAME = CURLOPTTYPE_OBJECTPOINT + 204;

    public static int CURLOPT_TLSAUTH_PASSWORD = CURLOPTTYPE_OBJECTPOINT + 205;

    public static int CURLOPT_TLSAUTH_TYPE = CURLOPTTYPE_OBJECTPOINT + 206;

    public static int CURLOPT_TRANSFER_ENCODING = CURLOPTTYPE_LONG + 207;

    public static int CURLOPT_CLOSESOCKETFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 208;

    public static int CURLOPT_CLOSESOCKETDATA = CURLOPTTYPE_OBJECTPOINT + 209;

    public static int CURLOPT_GSSAPI_DELEGATION = CURLOPTTYPE_LONG + 210;

    public static int CURLOPT_DNS_SERVERS = CURLOPTTYPE_OBJECTPOINT + 211;

    public static int CURLOPT_ACCEPTTIMEOUT_MS = CURLOPTTYPE_LONG + 212;

    public static int CURLOPT_TCP_KEEPALIVE = CURLOPTTYPE_LONG + 213;

    public static int CURLOPT_TCP_KEEPIDLE = CURLOPTTYPE_LONG + 214;

    public static int CURLOPT_TCP_KEEPINTVL = CURLOPTTYPE_LONG + 215;

    public static int CURLOPT_SSL_OPTIONS = CURLOPTTYPE_LONG + 216;

    public static int CURLOPT_MAIL_AUTH = CURLOPTTYPE_OBJECTPOINT + 217;

    public static int CURLOPT_SASL_IR = CURLOPTTYPE_LONG + 218;

    public static int CURLOPT_XFERINFOFUNCTION = CURLOPTTYPE_FUNCTIONPOINT + 219;

    public static int CURLOPT_XOAUTH2_BEARER = CURLOPTTYPE_OBJECTPOINT + 220;

    public static int CURLOPT_DNS_INTERFACE = CURLOPTTYPE_OBJECTPOINT + 221;

    public static int CURLOPT_DNS_LOCAL_IP4 = CURLOPTTYPE_OBJECTPOINT + 222;

    public static int CURLOPT_DNS_LOCAL_IP6 = CURLOPTTYPE_OBJECTPOINT + 223;

    public static int CURLOPT_LOGIN_OPTIONS = CURLOPTTYPE_OBJECTPOINT + 224;

    public static int CURLOPT_SSL_ENABLE_NPN = CURLOPTTYPE_LONG + 225;

    public static int CURLOPT_SSL_ENABLE_ALPN = CURLOPTTYPE_LONG + 226;

    public static int CURLOPT_EXPECT_100_TIMEOUT_MS = CURLOPTTYPE_LONG + 227;

    public static int CURLOPT_PROXYHEADER = CURLOPTTYPE_OBJECTPOINT + 228;

    public static int CURLOPT_HEADEROPT = CURLOPTTYPE_LONG + 229;

    public static int CURLOPT_PINNEDPUBLICKEY = CURLOPTTYPE_OBJECTPOINT + 230;

    public static int CURLOPT_UNIX_SOCKET_PATH = CURLOPTTYPE_OBJECTPOINT + 231;

    public static int CURL_IPRESOLVE_WHATEVER = 0;

    public static int CURL_IPRESOLVE_V4 = 1;

    public static int CURL_IPRESOLVE_V6 = 2;

    public static int CURL_GLOBAL_SSL = 1 << 0;

    public static int CURL_GLOBAL_WIN32 = 1 << 1;

    public static int CURL_GLOBAL_ALL = CURL_GLOBAL_SSL | CURL_GLOBAL_WIN32;

    public static int CURL_GLOBAL_NOTHING = 0;

    public static int CURL_GLOBAL_DEFAULT = CURL_GLOBAL_ALL;

    public static int CURL_GLOBAL_ACK_EINTR = 1 << 2;


    public static boolean isLongOpt(int opt) {
        return LONG_OPT_SET.contains(opt);
    }

    static {
        OBJECT_POINT_OPT_SET.add(CURLOPT_WRITEDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_URL);
        LONG_OPT_SET.add(CURLOPT_PORT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROXY);
        OBJECT_POINT_OPT_SET.add(CURLOPT_USERPWD);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROXYUSERPWD);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RANGE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_READDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_ERRORBUFFER);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_WRITEFUNCTION);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_READFUNCTION);
        LONG_OPT_SET.add(CURLOPT_TIMEOUT);
        LONG_OPT_SET.add(CURLOPT_INFILESIZE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_POSTFIELDS);
        OBJECT_POINT_OPT_SET.add(CURLOPT_REFERER);
        OBJECT_POINT_OPT_SET.add(CURLOPT_FTPPORT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_USERAGENT);
        LONG_OPT_SET.add(CURLOPT_LOW_SPEED_LIMIT);
        LONG_OPT_SET.add(CURLOPT_LOW_SPEED_TIME);
        LONG_OPT_SET.add(CURLOPT_RESUME_FROM);
        OBJECT_POINT_OPT_SET.add(CURLOPT_COOKIE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_HTTPHEADER);
        OBJECT_POINT_OPT_SET.add(CURLOPT_HTTPPOST);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSLCERT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_KEYPASSWD);
        LONG_OPT_SET.add(CURLOPT_CRLF);
        OBJECT_POINT_OPT_SET.add(CURLOPT_QUOTE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_HEADERDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_COOKIEFILE);
        LONG_OPT_SET.add(CURLOPT_SSLVERSION);
        LONG_OPT_SET.add(CURLOPT_TIMECONDITION);
        LONG_OPT_SET.add(CURLOPT_TIMEVALUE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CUSTOMREQUEST);
        OBJECT_POINT_OPT_SET.add(CURLOPT_STDERR);
        OBJECT_POINT_OPT_SET.add(CURLOPT_POSTQUOTE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_OBSOLETE40);
        LONG_OPT_SET.add(CURLOPT_VERBOSE);
        LONG_OPT_SET.add(CURLOPT_HEADER);
        LONG_OPT_SET.add(CURLOPT_NOPROGRESS);
        LONG_OPT_SET.add(CURLOPT_NOBODY);
        LONG_OPT_SET.add(CURLOPT_FAILONERROR);
        LONG_OPT_SET.add(CURLOPT_UPLOAD);
        LONG_OPT_SET.add(CURLOPT_POST);
        LONG_OPT_SET.add(CURLOPT_DIRLISTONLY);
        LONG_OPT_SET.add(CURLOPT_APPEND);
        LONG_OPT_SET.add(CURLOPT_NETRC);
        LONG_OPT_SET.add(CURLOPT_FOLLOWLOCATION);
        LONG_OPT_SET.add(CURLOPT_TRANSFERTEXT);
        LONG_OPT_SET.add(CURLOPT_PUT);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_PROGRESSFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROGRESSDATA);
        LONG_OPT_SET.add(CURLOPT_AUTOREFERER);
        LONG_OPT_SET.add(CURLOPT_PROXYPORT);
        LONG_OPT_SET.add(CURLOPT_POSTFIELDSIZE);
        LONG_OPT_SET.add(CURLOPT_HTTPPROXYTUNNEL);
        OBJECT_POINT_OPT_SET.add(CURLOPT_INTERFACE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_KRBLEVEL);
        LONG_OPT_SET.add(CURLOPT_SSL_VERIFYPEER);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CAINFO);
        LONG_OPT_SET.add(CURLOPT_MAXREDIRS);
        LONG_OPT_SET.add(CURLOPT_FILETIME);
        OBJECT_POINT_OPT_SET.add(CURLOPT_TELNETOPTIONS);
        LONG_OPT_SET.add(CURLOPT_MAXCONNECTS);
        LONG_OPT_SET.add(CURLOPT_OBSOLETE72);
        LONG_OPT_SET.add(CURLOPT_FRESH_CONNECT);
        LONG_OPT_SET.add(CURLOPT_FORBID_REUSE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RANDOM_FILE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_EGDSOCKET);
        LONG_OPT_SET.add(CURLOPT_CONNECTTIMEOUT);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_HEADERFUNCTION);
        LONG_OPT_SET.add(CURLOPT_HTTPGET);
        LONG_OPT_SET.add(CURLOPT_SSL_VERIFYHOST);
        OBJECT_POINT_OPT_SET.add(CURLOPT_COOKIEJAR);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSL_CIPHER_LIST);
        LONG_OPT_SET.add(CURLOPT_HTTP_VERSION);
        LONG_OPT_SET.add(CURLOPT_FTP_USE_EPSV);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSLCERTTYPE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSLKEY);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSLKEYTYPE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSLENGINE);
        LONG_OPT_SET.add(CURLOPT_SSLENGINE_DEFAULT);
        LONG_OPT_SET.add(CURLOPT_DNS_USE_GLOBAL_CACHE);
        LONG_OPT_SET.add(CURLOPT_DNS_CACHE_TIMEOUT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PREQUOTE);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_DEBUGFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_DEBUGDATA);
        LONG_OPT_SET.add(CURLOPT_COOKIESESSION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CAPATH);
        LONG_OPT_SET.add(CURLOPT_BUFFERSIZE);
        LONG_OPT_SET.add(CURLOPT_NOSIGNAL);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SHARE);
        LONG_OPT_SET.add(CURLOPT_PROXYTYPE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_ACCEPT_ENCODING);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PRIVATE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_HTTP200ALIASES);
        LONG_OPT_SET.add(CURLOPT_UNRESTRICTED_AUTH);
        LONG_OPT_SET.add(CURLOPT_FTP_USE_EPRT);
        LONG_OPT_SET.add(CURLOPT_HTTPAUTH);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_SSL_CTX_FUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSL_CTX_DATA);
        LONG_OPT_SET.add(CURLOPT_FTP_CREATE_MISSING_DIRS);
        LONG_OPT_SET.add(CURLOPT_PROXYAUTH);
        LONG_OPT_SET.add(CURLOPT_FTP_RESPONSE_TIMEOUT);
        LONG_OPT_SET.add(CURLOPT_IPRESOLVE);
        LONG_OPT_SET.add(CURLOPT_MAXFILESIZE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_NETRC_FILE);
        LONG_OPT_SET.add(CURLOPT_USE_SSL);
        LONG_OPT_SET.add(CURLOPT_TCP_NODELAY);
        LONG_OPT_SET.add(CURLOPT_FTPSSLAUTH);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_IOCTLFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_IOCTLDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_FTP_ACCOUNT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_COOKIELIST);
        LONG_OPT_SET.add(CURLOPT_IGNORE_CONTENT_LENGTH);
        LONG_OPT_SET.add(CURLOPT_FTP_SKIP_PASV_IP);
        LONG_OPT_SET.add(CURLOPT_FTP_FILEMETHOD);
        LONG_OPT_SET.add(CURLOPT_LOCALPORT);
        LONG_OPT_SET.add(CURLOPT_LOCALPORTRANGE);
        LONG_OPT_SET.add(CURLOPT_CONNECT_ONLY);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CONV_FROM_NETWORK_FUNCTION);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CONV_TO_NETWORK_FUNCTION);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CONV_FROM_UTF8_FUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_FTP_ALTERNATIVE_TO_USER);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_SOCKOPTFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SOCKOPTDATA);
        LONG_OPT_SET.add(CURLOPT_SSL_SESSIONID_CACHE);
        LONG_OPT_SET.add(CURLOPT_SSH_AUTH_TYPES);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSH_PUBLIC_KEYFILE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSH_PRIVATE_KEYFILE);
        LONG_OPT_SET.add(CURLOPT_FTP_SSL_CCC);
        LONG_OPT_SET.add(CURLOPT_TIMEOUT_MS);
        LONG_OPT_SET.add(CURLOPT_CONNECTTIMEOUT_MS);
        LONG_OPT_SET.add(CURLOPT_HTTP_TRANSFER_DECODING);
        LONG_OPT_SET.add(CURLOPT_HTTP_CONTENT_DECODING);
        LONG_OPT_SET.add(CURLOPT_NEW_FILE_PERMS);
        LONG_OPT_SET.add(CURLOPT_NEW_DIRECTORY_PERMS);
        LONG_OPT_SET.add(CURLOPT_POSTREDIR);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSH_HOST_PUBLIC_KEY_MD5);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_OPENSOCKETFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_OPENSOCKETDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_COPYPOSTFIELDS);
        LONG_OPT_SET.add(CURLOPT_PROXY_TRANSFER_MODE);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_SEEKFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SEEKDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CRLFILE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_ISSUERCERT);
        LONG_OPT_SET.add(CURLOPT_ADDRESS_SCOPE);
        LONG_OPT_SET.add(CURLOPT_CERTINFO);
        OBJECT_POINT_OPT_SET.add(CURLOPT_USERNAME);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PASSWORD);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROXYUSERNAME);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROXYPASSWORD);
        OBJECT_POINT_OPT_SET.add(CURLOPT_NOPROXY);
        LONG_OPT_SET.add(CURLOPT_TFTP_BLKSIZE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SOCKS5_GSSAPI_SERVICE);
        LONG_OPT_SET.add(CURLOPT_SOCKS5_GSSAPI_NEC);
        LONG_OPT_SET.add(CURLOPT_PROTOCOLS);
        LONG_OPT_SET.add(CURLOPT_REDIR_PROTOCOLS);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSH_KNOWNHOSTS);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_SSH_KEYFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_SSH_KEYDATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_MAIL_FROM);
        OBJECT_POINT_OPT_SET.add(CURLOPT_MAIL_RCPT);
        LONG_OPT_SET.add(CURLOPT_FTP_USE_PRET);
        LONG_OPT_SET.add(CURLOPT_RTSP_REQUEST);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RTSP_SESSION_ID);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RTSP_STREAM_URI);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RTSP_TRANSPORT);
        LONG_OPT_SET.add(CURLOPT_RTSP_CLIENT_CSEQ);
        LONG_OPT_SET.add(CURLOPT_RTSP_SERVER_CSEQ);
        OBJECT_POINT_OPT_SET.add(CURLOPT_INTERLEAVEDATA);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_INTERLEAVEFUNCTION);
        LONG_OPT_SET.add(CURLOPT_WILDCARDMATCH);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CHUNK_BGN_FUNCTION);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CHUNK_END_FUNCTION);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_FNMATCH_FUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CHUNK_DATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_FNMATCH_DATA);
        OBJECT_POINT_OPT_SET.add(CURLOPT_RESOLVE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_TLSAUTH_USERNAME);
        OBJECT_POINT_OPT_SET.add(CURLOPT_TLSAUTH_PASSWORD);
        OBJECT_POINT_OPT_SET.add(CURLOPT_TLSAUTH_TYPE);
        LONG_OPT_SET.add(CURLOPT_TRANSFER_ENCODING);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_CLOSESOCKETFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_CLOSESOCKETDATA);
        LONG_OPT_SET.add(CURLOPT_GSSAPI_DELEGATION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_DNS_SERVERS);
        LONG_OPT_SET.add(CURLOPT_ACCEPTTIMEOUT_MS);
        LONG_OPT_SET.add(CURLOPT_TCP_KEEPALIVE);
        LONG_OPT_SET.add(CURLOPT_TCP_KEEPIDLE);
        LONG_OPT_SET.add(CURLOPT_TCP_KEEPINTVL);
        LONG_OPT_SET.add(CURLOPT_SSL_OPTIONS);
        OBJECT_POINT_OPT_SET.add(CURLOPT_MAIL_AUTH);
        LONG_OPT_SET.add(CURLOPT_SASL_IR);
        FUNCTION_POINT_OPT_SET.add(CURLOPT_XFERINFOFUNCTION);
        OBJECT_POINT_OPT_SET.add(CURLOPT_XOAUTH2_BEARER);
        OBJECT_POINT_OPT_SET.add(CURLOPT_DNS_INTERFACE);
        OBJECT_POINT_OPT_SET.add(CURLOPT_DNS_LOCAL_IP4);
        OBJECT_POINT_OPT_SET.add(CURLOPT_DNS_LOCAL_IP6);
        OBJECT_POINT_OPT_SET.add(CURLOPT_LOGIN_OPTIONS);
        LONG_OPT_SET.add(CURLOPT_SSL_ENABLE_NPN);
        LONG_OPT_SET.add(CURLOPT_SSL_ENABLE_ALPN);
        LONG_OPT_SET.add(CURLOPT_EXPECT_100_TIMEOUT_MS);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PROXYHEADER);
        LONG_OPT_SET.add(CURLOPT_HEADEROPT);
        OBJECT_POINT_OPT_SET.add(CURLOPT_PINNEDPUBLICKEY);
        OBJECT_POINT_OPT_SET.add(CURLOPT_UNIX_SOCKET_PATH);
    }
}
