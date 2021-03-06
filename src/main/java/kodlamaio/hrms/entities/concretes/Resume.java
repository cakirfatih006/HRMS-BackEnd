package kodlamaio.hrms.entities.concretes;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
//@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="resumes")

public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	
	private int id;
	
	
	@ManyToOne(targetEntity = Candidate.class, fetch=FetchType.LAZY )
	@JoinColumn(name = "candidate_id" , referencedColumnName = "id", nullable = false)

	private Candidate candidate;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linked_link")
	private String linkedLink;
	
	@Column(name="photo")
	private String photoLink;
	
	@Column(name="description")
	private String description;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="updated_date")
	private LocalDate updatedDate;
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	
	@OneToMany(mappedBy = "resume", cascade = CascadeType.ALL ) 
	private List<Language> languages;
	
	@OneToMany(mappedBy ="resume", cascade = CascadeType.ALL)
	private List<Technology> technologies;
	
	@OneToMany(mappedBy ="resume", cascade = CascadeType.ALL)
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy ="resume", cascade = CascadeType.ALL)
	private List<Education> educations;

	
	
	
	
	
}
