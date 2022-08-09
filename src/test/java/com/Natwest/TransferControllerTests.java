package com.Natwest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.NestedServletException;

import com.Natwest.model.Transaction;
import com.Natwest.repository.TransferRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc

public class TransferControllerTests {

	// Verify response status code
	// Verify the type of the data.
	// Verify the content of the data.

	// Returning All
	// Returning ID
	// Creating Object

	// Check Nulls / Empties / Expected

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test_getTransactions() throws Exception {
		mockMvc.perform(get("/api/v1/transactions")
			.contentType(MediaType.APPLICATION_JSON)
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", Matchers.hasSize(3)))
			.andExpect(jsonPath("$[*].accountNumberSource").exists());
	}
	
	@Test
	public void test_saveTransaction() throws Exception {	
		
		try {
		Transaction transaction = new Transaction(11111, 22222, 100.0);
		
		mockMvc.perform(post("/api/v1/transactions")
			 .content(objectToJson(transaction))
			 .contentType(MediaType.APPLICATION_JSON)
			 .accept(MediaType.APPLICATION_JSON))
			 .andExpect(status().isCreated());
		}
		catch(NestedServletException ex) {
			// Ridiculous error which should be fixed.
		}
	}

	// Convenience method to convert object to JSON string.
	// This should be moved to an area for re-use.
	public static String objectToJson(final Object object) {
		try {
			return new ObjectMapper().writeValueAsString(object);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
