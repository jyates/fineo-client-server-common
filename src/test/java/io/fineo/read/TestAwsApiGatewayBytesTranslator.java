package io.fineo.read;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestAwsApiGatewayBytesTranslator {

  @Test
  public void testTranslate() throws Exception {
    String msg = "some message";
    AwsApiGatewayBytesTranslator t = new AwsApiGatewayBytesTranslator();
    byte[] encoded = t.encode(msg.getBytes());
    assertNotEquals(msg, new String(encoded));
    assertEquals(msg, new String(t.decode(encoded)));
  }
}
