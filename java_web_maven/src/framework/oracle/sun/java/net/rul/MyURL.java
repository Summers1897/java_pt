package framework.oracle.sun.java.net.rul;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
public class MyURL {
	private static StringBuilder builder;
	private static URL url;
	private static URLConnection urlConnection;
	private static HttpURLConnection httpURLConnection;
	public static void main(String[] args) throws Exception {
		builder = new StringBuilder();
		builder.delete(0, builder.length());
		URLconnection();
	}
	public static void URLgetandpost() {
	}
	public static void URLconnection() throws Exception {
		url = new URL("http://127.0.0.1/spr/test/test.action");
		urlConnection = url.openConnection();
		httpURLConnection = (HttpURLConnection) urlConnection;
		httpURLConnection.setDoOutput(true);
		httpURLConnection.setDoInput(true);
		// httpURLConnection.setRequestProperty("Content-type",
		// "application/x-java-serialized-object");
		// httpURLConnection.setRequestMethod("post");
		// 连接，从上述第2条中url.openConnection()至此的配置必须要在connect之前完成，
		httpURLConnection.connect();
		// 此处getOutputStream会隐含的进行connect(即：如同调用上面的connect()方法，
		// 所以在开发中不调用上述的connect()也可以)。
		OutputStream outStrm = httpURLConnection.getOutputStream();
		ObjectOutputStream objOutputStrm = new ObjectOutputStream(outStrm);
		// 向对象输出流写出数据，这些数据将存到内存缓冲区中
		objOutputStrm.writeObject(new String("我是测试数据"));
		// 刷新对象输出流，将任何字节都写入潜在的流中（些处为ObjectOutputStream）
		objOutputStrm.flush();
		// 关闭流对象。此时，不能再向对象输出流写入任何数据，先前写入的数据存在于内存缓冲区中,
		// 在调用下边的getInputStream()函数时才把准备好的http请求正式发送到服务器
		objOutputStrm.close();
		// 调用HttpURLConnection连接对象的getInputStream()函数,
		// 将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。
		InputStream inStrm = httpURLConnection.getInputStream(); // <===注意，实际发送请求的代码段就在这里
		// 上边的httpConn.getInputStream()方法已调用,本次HTTP请求已结束,下边向对象输出流的输出已无意义，
		// 既使对象输出流没有调用close()方法，下边的操作也不会向对象输出流写入任何数据.
		// 因此，要重新发送数据时需要重新创建连接、重新设参数、重新创建流对象、重新写数据、
		// 重新发送数据(至于是否不用重新这些操作需要再研究)
		objOutputStrm.writeObject(new String(""));
		httpURLConnection.getInputStream();
	}
	public static void URL2() {
	}
	public static void servletURL3() {
	}
	public static void servletURL4() {
	}
}
