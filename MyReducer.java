/* Apratim Tripathi
   Section- DS
   Roll no. 15
   Uni roll no.- 2015152    
 */



// exceptions import
import java.io.IOException;

// import box classes
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

// import reducer class
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;

public class AptReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		int y = 0;
		for (IntWritable x : values) {
			y += 1;
		}
		context.write(key, new IntWritable(y));
	}
}
