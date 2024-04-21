package org.example.util;

public class StringProvider {
    public static String getString() {
        String content = "네트워크를 구성하는 하위 요소인 노드와 링크에 대하여 간략하게 설명하시오.\n" +
                "처리량(throughput)과 트래픽의 차이점에 대하여 설명하시오.\n" +
                "대역폭이란 무엇을 말하는지 설명하시오.\n" +
                "네트워크 토폴로지에 대하여 간략하게 설명하시오.\n" +
                "트리 토폴로지의 정의와 특징에 대해 설명하시오.\n" +
                "버스 토폴로지의 정의와 특징에 대해 설명하시오.\n" +
                "스푸핑이란 무엇인지 설명하시오.\n" +
                "스타 토폴로지의 정의와 특징에 대해 설명하시오.\n" +
                "링형 토폴로지의 정의와 특징에 대해 설명하시오.\n" +
                "메시 토폴로지의 정의와 특징에 대해 설명하시오.\n" +
                "병목현상이란 무엇인지 설명하시오.\n" +
                "규모를 기반으로 네트워크를 분류하는 세 용어 LAN, MAN, WAN은 무엇의 약어인지 설명하시오.\n" +
                "ping 명령어에 대하여 설명하시오\n" +
                "netstat 명령어에 대하여 설명하시오.\n" +
                "nslookup 명령어에 대하여 설명하시오.\n" +
                "tracert 명령어에 대하여 설명하시오.\n" +
                "네트워크 프로토콜을 표준화하는 단체의 예시를 들어보시오.\n" +
                "IEEE802.3 프로토콜에 대하여 설명하시오.\n" +
                "TCP/IP 4계층과 OSI 7계층은 어떻게 다른지 설명하시오.\n" +
                "어플리케이션 계층에 대해서 간략히 설명하시오.\n" +
                "전송 계층에 대해서 간략히 설명하시오\n" +
                "가상회선 패킷 교환 방식에 대하여 간략히 설명하시오.\n" +
                "데이터그램 패킷 교환 방식에 대하여 간략히 설명하시오.\n" +
                "3-way handshake에 대하여 설명하시오.\n" +
                "4-way handshake에 대하여 설명하시오.\n" +
                "TCP 연결 해제 과정 중 TIME_WAIT이라는 상태가 필요한 이유에 대해 설명하시오.\n" +
                "인터넷 계층에 대해서 간략히 설명하시오.\n" +
                "링크 계층에 대해서 간략히 설명하시오.\n" +
                "전이중화 통신에 대해 간략히 설명하시오.\n" +
                "CSMA/CD에 대해 설명하시오.\n" +
                "트위스티드 페어 케이블에 대해 간략히 설명하시오.\n" +
                "광섬유 케이블에 대해 간략히 설명하시오.\n" +
                "반이중화 통신에 대해 간략히 설명하시오.\n" +
                "CSMA/CA에 대해 설명하시오.\n" +
                "무선 LAN에 대하여 주파수와 연결지어 간략하게 설명하시오.\n" +
                "와이파이에 대해 간략히 설명하시오.\n" +
                "BSS와 ESS에 대해 간략하게 설명하시오.\n" +
                "이더넷 프레임에 대해 설명하시오.\n" +
                "캡슐화 과정이란 무엇인지 간략히 설명하시오.\n" +
                "비캡슐화 과정이란 무엇인지 간략히 설명하시오.\n" +
                "TCP/IP 4계층에서 각 계층별로 PDU를 어떻게 부르는지 설명하시오.\n" +
                "네트워크 기기의 처리 범위를 OSI 7계층을 기준으로 간략하게 설명하시오.\n" +
                "어플리케이션 계층의 네트워크 처리 기기에는 무엇이 있는지 설명하시오.\n" +
                "L7 스위치에 대하여 설명하시오.\n" +
                "L4 스위치와 L7 스위치의 차이를 설명하시오.\n" +
                "L4 스위치 또는 L7 스위치에서 사용되는 헬스 체크에 대해 설명하시오.\n" +
                "로드밸런서의 기능인 서버 이중화에 대해 설명하시오.\n" +
                "인터넷 계층의 네트워크 처리 기기에는 무엇이 있는지 설명하시오\n" +
                "라우터에 대해 간략하게 설명하시오.\n" +
                "L3 스위치에 대해 간략하게 설명하시오.\n" +
                "데이터링크 계층의 네트워크 처리 기기에는 무엇이 있는지 설명하시오.\n" +
                "L2 스위치에 대하여 간략하게 설명하시오.\n" +
                "네트워크 처리 기기인 브리지에 대하여 간략하게 설명하시오.\n" +
                "물리 계층의 네트워크 처리 기기에는 무엇이 있는지 설명하시오.\n" +
                "네트워크 처리 기기인 NIC에 대하여 간략하게 설명하시오.\n" +
                "네트워크 처리 기기인 리피터에 대하여 간략하게 설명하시오.\n" +
                "네트워크 처리 기기인 AP에 대하여 간략하게 설명하시오.\n" +
                "ARP 프로토콜에 대하여 설명하시오.\n" +
                "홉바이홉 통신이란 무엇인지 설명하시오.\n" +
                "라우팅 테이블에 대하여 간략하게 설명하시오.\n" +
                "게이트웨이에 대하여 간략하게 설명하시오.\n" +
                "IPv4와 IPv6의 차이점에 대하여 설명하시오.\n" +
                "클래스 기반 할당 방식에 대해 설명하시오.\n" +
                "DHCP에 대하여 간략하게 설명하시오.\n" +
                "NAT에 대하여 설명하시오.\n" +
                "HTTP/1.0에 대하여 설명하시오.\n" +
                "HTTP/1.1에 대하여 설명하시오.\n" +
                "HTTP/2에 대하여 설명하시오.\n" +
                "HTTPS에 대하여 설명하시오.\n" +
                "SEO에 대하여 설명하시오.\n" +
                "HTTP/3에 대하여 설명하시오.\n";
        return content;
    }
}
