<h1>ABOUT</h1>
This project is prepared to serve as a sample application for Hazelcast, the leading open source in-memory data grid . Here, Hazelcast's use case is HTTP Session Replication. 
 
<h2>Prerequisites</h2>
You should have installed Apache Tomcat7 and Apache Maven 3.2.1 on your system. Download links are given below. Choose appropriate one for you.

Apache Tomcat7 - http://tomcat.apache.org/download-70.cgi <br />
Apache Maven 3.2.1 - http://maven.apache.org/download.cgi<br />
Hazelcast 3.3-EA2 - http://hazelcast.com/products/hazelcast-enterprise/ 

Extract .zip file. Drop hazelcast-3.3-EA2-ee.jar and hazelcast-sessions-tomcat7-3.3-EA2.jar to your tomcat-installation-path/lib. They are under /lib of extracted folder.<br />

Next, you must put Hazelcast.xml file to tomcat-installation-directory/lib . You can find a sample Hazelcast.xml file under extracted-hazelcast-folder/bin .
<br />
<br />
ToolBase.js - Abstract base class for painting Tools<br />
*****Tool.js - Painting tool implementations, pencil, brush, circle, spray, etc.<br />

Sample Web Session Replication App through Hazelcast
