package quiz0;

import java.time.LocalDate;

/**
 * Evaluates applications for graduate school.
 * Separates applications into groups "accepted" and "rejected"
 */
public class AppAssessor {
	private ApplicantForGradSchool[] applicants;
	private ApplicantForGradSchool[] accepted;
	private ApplicantForGradSchool[] rejected;
	public AppAssessor(ApplicantForGradSchool[] applicants) {
		this.applicants = applicants;
		evaluateApplicants();
	}
	
	private void evaluateApplicants() {
		ApplicantForGradSchool[] acceptedTemp = new ApplicantForGradSchool[applicants.length];
		ApplicantForGradSchool[] rejectedTemp = new ApplicantForGradSchool[applicants.length];
		int acceptedLength = 0;
		int rejectedLength = 0;
		for(int i = 0; i < applicants.length; ++i) {
			ApplicantForGradSchool a = applicants[i];
			LocalDate graduationDate = a.getBachelorsGraduationDate();
			float gpa = a.getGpa();
			int rank = a.getClassRank();
			if(graduationDate.getYear() > 2012 
				&& gpa > 3.4f
				&& 1 < rank && rank < 11) {
				  acceptedTemp[acceptedLength++] = a;
			} else {
				rejectedTemp[rejectedLength++] = a;
			}
		}
		accepted = new ApplicantForGradSchool[acceptedLength];
		rejected = new ApplicantForGradSchool[rejectedLength];
		System.arraycopy(acceptedTemp, 0, accepted, 0, acceptedLength);
		System.arraycopy(rejectedTemp, 0, rejected, 0, rejectedLength);
	}

	public ApplicantForGradSchool[] getApplicants() {
		return applicants;
	}

	public void setApplicants(ApplicantForGradSchool[] applicants) {
		this.applicants = applicants;
	}

	public ApplicantForGradSchool[] getAccepted() {
		return accepted;
	}

	public void setAccepted(ApplicantForGradSchool[] accepted) {
		this.accepted = accepted;
	}

	public ApplicantForGradSchool[] getRejected() {
		return rejected;
	}

	public void setRejected(ApplicantForGradSchool[] rejected) {
		this.rejected = rejected;
	}
}
