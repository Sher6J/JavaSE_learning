package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示Internet协议(IP)地址

    public static InetAddress getByName(String host); 确认主机名称的IP地址, 主机名称可以是机器名称, 也可以是IP地址
    public String getHostName(); 获取此IP地址的主机名
    public String getHostAddress(); 返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("liujx-HP-ENVY-Laptop-13-ah1xxx");
        InetAddress address = InetAddress.getByName("127.0.1.1");

        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名: " + name);
        System.out.println("IP地址: " + ip);
    }
}
