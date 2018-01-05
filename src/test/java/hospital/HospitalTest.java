package hospital;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import hopsital.Doctor;
import hopsital.HospitalEmployee;

public class HospitalTest {

	@Test
	public void shouldBeAbleToCreateADoctorObject() {
		Doctor underTest = new Doctor("", "", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatDoctorIsHospitalEmployee() {
		HospitalEmployee underTest = new Doctor("", "", "");
		assertNotNull(underTest);

	}
}