package com.Natwest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.Natwest.model.Transaction;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTests {

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
	public void test_getAccounts() throws Exception {
		mockMvc.perform(get("/api/v1/accounts")
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$", Matchers.hasSize(3)))
			.andExpect(jsonPath("$[0].accountNumber").value(("11111")))
			.andExpect(jsonPath("$[1].accountNumber").value(("22222")))
			.andExpect(jsonPath("$[2].accountNumber").value(("33333")));
	}

}
