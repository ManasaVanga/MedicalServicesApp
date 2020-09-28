package edu.neu.hms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="patient_info")
public class Patient {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int id;
    // Personal Details
	@Column(name = "patient_firstname")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String firstName;
	
	@Column(name = "patient_lastname")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String lastName;
	
	@Column(name = "patient_gender")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String gender;
	
	@Column(name = "patient_occupation")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String Occupation;
	
	@Column(name = "patient_dob")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    //check for date format
    private String dob;
	
	@Column(name = "patient_age")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private int age;
	
	@Column(name = "patient_bloodgroup")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String bloodGroup;
	
	@Column(name = "patient_maritalstatus")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String maritalStatus;
	
    
    //Contact Details
	@Column(name = "patient_address")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String address;
	
	@Column(name = "patient_city")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String city;
	
	@Column(name = "patient_country")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String Country;
	
	@Column(name = "patient_pincode")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private int pincode;
	
	@Column(name = "patient_contact")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String contactNumber;
	
	@Column(name="patient_registrationdate")
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
    private String register_date;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegister_date() {
		return register_date;
	}

	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}