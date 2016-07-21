package us.yellosoft.hellos3;

import com.amazonaws.services.s3.AmazonS3Client;

import org.junit.Test;
import org.junit.Assert;

public class TestS3Transfer {
  private static final String BUCKET = "mr-bean-quotes";
  private static final String KEY = "s01e07";
  private static final String CONTENT = "Merry Christmas, Mr. Bean.";

  @Test
  public void testTransfer() throws Exception {
    final AmazonS3Client amazonS3Client = new AmazonS3Client();
    amazonS3Client.createBucket(BUCKET);
    amazonS3Client.putObject(BUCKET, KEY, CONTENT);

    Assert.assertEquals(CONTENT, amazonS3Client.getObjectAsString(BUCKET, KEY));

    amazonS3Client.deleteObject(BUCKET, KEY);
    amazonS3Client.deleteBucket(BUCKET);
    amazonS3Client.shutdown();
  }
}
