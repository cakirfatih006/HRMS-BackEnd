package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@Data
//@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"}) // tembel
public class JobTitle {
	
	
	@Id							
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="title")
	@NotBlank(message="İsim Alanı Boş olamaz")
	private String title;
	
	/*@JsonIgnore
	@OneToMany(mappedBy ="jobTitle")
	private List<JobPosting> jobPostings;*/
	
	
}
