package com.day3.session1.solid.srp;
class JdbcConn{}
class JMsConn{}
class XMLConn{}
class JdbcConnFactory{
    public JdbcConn getJdbcConn(){return new JdbcConn();}
}

class ConnectionFactroy{

    public JMsConn getJMsConn(){return new JMsConn();}
    public XMLConn getXMLConn(){return new XMLConn();}

}
public class DemoSRP {
    public static void main(String[] args) {

    }
}
