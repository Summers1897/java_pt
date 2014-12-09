package com.html.scan;
import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.junit.Test;
public class MavenSubPath {
	@Test
	public void test() throws Exception {
		mavenSubJar("http://dist.springsource.com/release/TOOLS/gradle");
	}
	public static void mavenSubJar(String url) throws Exception {
		Parser parser = new Parser(url);
		TagNameFilter tagNameFilter = new TagNameFilter("a");
		NodeList nodes = parser.parse(tagNameFilter);
		for (int i = 0; i < nodes.size(); i++) {
			Node node = nodes.elementAt(i);
			LinkTag linkTag = (LinkTag) node;
			System.out.println(linkTag);
			// if (StringUtils.contains(linkTag.getChildrenHTML(), filter)) {
			//
			// }
		}
	}
}
