/* Apratim Tripathi
   Section- DS
   Roll no. 15
   Uni roll no.- 2015152    
 */


// exception handling 
import java.io.IOException;

// box classes import
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

// import mapper class
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Mapper.Context;

public class AptMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		String inputstring = value.toString();
		for (String x : inputstring.split(" ")) {
			if (x.equals("Apple") || x.equals("Banana") || x.equals("Grapes")) {
				context.write(new Text(x), new IntWritable(1));
			}
		}
	}
}
