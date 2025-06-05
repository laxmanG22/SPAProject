package jdbc;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class JavaReadXML {
    public static void main(String[] args) {
        try {
            // Load and parse XML file
            File inputFile = new File("attendance.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            // Normalize the XML structure
            doc.getDocumentElement().normalize();

            // Get attendance entries
            NodeList nList = doc.getElementsByTagName("attendance");

            System.out.println("Reading Attendance Records:\n");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element elem = (Element) nNode;

                    String id = elem.getElementsByTagName("attendanceid").item(0).getTextContent().trim();
                    String userId = elem.getElementsByTagName("userid").item(0).getTextContent().trim();
                    String deptId = elem.getElementsByTagName("deptid").item(0).getTextContent().trim();
                    String date = elem.getElementsByTagName("date").item(0).getTextContent().trim();
                    String status = elem.getElementsByTagName("status").item(0).getTextContent().trim();

                    System.out.printf("ID: %s, User: %s, Dept: %s, Date: %s, Status: %s%n",
                            id, userId, deptId, date, status);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

