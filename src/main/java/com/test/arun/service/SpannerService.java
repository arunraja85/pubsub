/**
 * 
 */
package com.test.arun.service;

import java.util.ArrayList;
import java.util.List;

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;

/**
 * @author arunraja.jayavel
 *
 */
public class SpannerService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String projectId = "qwiklabs-gcp-01-d9694e1e4b9f";
////	    TopicName topic = TopicName.create(projectId, "feedback");
//		Feedback feedback = new Feedback();
//		feedback.setEmail("arunraja@test.com");
//		  SpannerOptions options = SpannerOptions.newBuilder().build();
//	        Spanner spanner = options.getService();
//	        try {
//	            DatabaseId db = DatabaseId.of(options.getProjectId(), "quiz-instance", "quiz-database");
//	            DatabaseClient dbClient = spanner.getDatabaseClient(db);
//
//	            List<Mutation> mutations = new ArrayList<>();
//
//	            mutations.add(
//	                    Mutation.newInsertBuilder("Feedback")
//	                            .set("feedbackId")
//	                            .to(feedback.getEmail()+'_'+feedback.getQuiz()+"_"+feedback.getTimestamp())
//	                            .set("email")
//	                            .to(feedback.getEmail())
//	                            .set("quiz")
//	                            .to(feedback.getQuiz())
//	                            .set("feedback")
//	                            .to(feedback.getFeedback())
//	                            .set("rating")
//	                            .to(feedback.getRating())
//	                            .set("score")
//	                            .to(feedback.getSentimentScore())
//	                            .set("timestamp")
//	                            .to(feedback.getTimestamp())
//	                            .build());
//
//	            dbClient.write(mutations);
//	        }catch(Exception e){
//	            e.printStackTrace();
//	        }

	}
	
	public void get() {
	}

}
