package com.spin.med;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spin.med.repositories.SolicitacaoMedicaRepository;
import com.spin.med.services.SolicitacaoMedicaService;
import com.spin.med.services.SolicitacaoMedicaServiceImpl;

@RunWith(SpringRunner.class)
public class SolicitacaoMedicaServiceTest {

	@TestConfiguration
	static class EmployeeServiceImplTestContextConfiguration {

		@Bean
		public SolicitacaoMedicaService employeeService() {
			return new SolicitacaoMedicaServiceImpl();
		}
	}

	@Autowired
	private SolicitacaoMedicaService service;

	@MockBean
	private SolicitacaoMedicaRepository repository;

	@Before
	public void setUp() {
		Mockito.when(repository.verifyPermission(1208l, 25, "M")).thenReturn(Boolean.TRUE);
		Mockito.when(repository.verifyPermission(9999l, 15, "F")).thenReturn(Boolean.FALSE);
	}

	@Test
	public void whenPermissionAllowed_returnIsAllowed() {
		Boolean allowed = service.verifyPermission(1208l, 25, "M");
		assertTrue(allowed);
	}

	@Test
	public void whenPermissionDanied_returnIsDanied() {
		Boolean allowed = service.verifyPermission(9999L, 15, "F");
		assertFalse(allowed);
	}

	@Test
	public void whenNotExists_returnIsDanied() {
		Boolean allowed = service.verifyPermission(0l, 0, "X");
		assertFalse(allowed);
	}

}
