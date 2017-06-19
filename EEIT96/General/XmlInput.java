import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlInput {
	
	public static void main(String[] args) {
		File xml = new File("C:/Users/Student/Desktop/01.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		Document dom = null;
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			dom = builder.parse(xml);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		NodeList items = dom.getElementsByTagName("item");
		int length = items.getLength();
		for(int i=0; i<length; i++) {
			Node itemNode = items.item(i);
			String itemNodeName = itemNode.getNodeName();
			System.out.println(itemNodeName+"("+(i+1)+")");
			
			NodeList itemChildNodes = itemNode.getChildNodes();
			int size = itemChildNodes.getLength();
			for(int j=0; j<size; j++) {
				Node itemChildNode = itemChildNodes.item(j);
				String itemChildNodeName = itemChildNode.getNodeName();
				if(itemChildNodeName!=null && itemChildNodeName.equals("pubDate")) {
					String pubDateFirstChildNodeValue = itemChildNode.getFirstChild().getNodeValue();
					System.out.println("\t"+pubDateFirstChildNodeValue);
				} else if(itemChildNodeName!=null && itemChildNodeName.equals("enclosure")) {
					Element element = (Element) itemChildNode;
					String url = element.getAttribute("url");
					System.out.println("\t"+url);
				}
			}
			
			System.out.println();
		}
		
	}
}
