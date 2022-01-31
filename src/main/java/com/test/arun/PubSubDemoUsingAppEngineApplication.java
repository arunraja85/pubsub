package com.test.arun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.test.arun.service.Feedback;

@SpringBootApplication
public class PubSubDemoUsingAppEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubSubDemoUsingAppEngineApplication.class, args);
		
		String projectId = "qwiklabs-gcp-01-d9694e1e4b9f";
//	    TopicName topic = TopicName.create(projectId, "feedback");
		Feedback feedback = new Feedback();
		feedback.setEmail("arunraja@test.com");
		  SpannerOptions options = SpannerOptions.newBuilder().build();
	        Spanner spanner = options.getService();
	        try {
	            DatabaseId db = DatabaseId.of(options.getProjectId(), "quiz-instance", "quiz-database");
	            DatabaseClient dbClient = spanner.getDatabaseClient(db);

	            List<Mutation> mutations = new ArrayList<>();

	            mutations.add(
	                    Mutation.newInsertBuilder("Feedback")
	                            .set("feedbackId")
	                            .to(feedback.getEmail()+'_'+feedback.getQuiz()+"_"+feedback.getTimestamp())
	                            .set("email")
	                            .to(feedback.getEmail())
	                            .set("quiz")
	                            .to(feedback.getQuiz())
	                            .set("feedback")
	                            .to(feedback.getFeedback())
	                            .set("rating")
	                            .to(feedback.getRating())
	                            .set("score")
	                            .to(feedback.getSentimentScore())
	                            .set("timestamp")
	                            .to(feedback.getTimestamp())
	                            .build());

	            dbClient.write(mutations);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	}

}
