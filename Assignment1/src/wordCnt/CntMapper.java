package wordCnt;

import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;

public class CntMapper extends Mapper<Object, Text, Text, IntWritable>{
	public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString());
		
		while (itr.hasMoreTokens()) {
			context.write(new Text(itr.nextToken()), new IntWritable(1));
		}
	}
}
