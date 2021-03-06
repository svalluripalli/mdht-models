/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public interface IHEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IHEFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.impl.IHEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunizations Section</em>'.
	 * @generated
	 */
	ImmunizationsSection createImmunizationsSection();

	/**
	 * Returns a new object of class '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Administered Section</em>'.
	 * @generated
	 */
	MedicationsAdministeredSection createMedicationsAdministeredSection();

	/**
	 * Returns a new object of class '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Entry</em>'.
	 * @generated
	 */
	ConcernEntry createConcernEntry();

	/**
	 * Returns a new object of class '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Document</em>'.
	 * @generated
	 */
	MedicalDocument createMedicalDocument();

	/**
	 * Returns a new object of class '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Problems Section</em>'.
	 * @generated
	 */
	ActiveProblemsSection createActiveProblemsSection();

	/**
	 * Returns a new object of class '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Concern Entry</em>'.
	 * @generated
	 */
	ProblemConcernEntry createProblemConcernEntry();

	/**
	 * Returns a new object of class '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry</em>'.
	 * @generated
	 */
	ProblemEntry createProblemEntry();

	/**
	 * Returns a new object of class '<em>Severity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity</em>'.
	 * @generated
	 */
	Severity createSeverity();

	/**
	 * Returns a new object of class '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Status Observation</em>'.
	 * @generated
	 */
	ProblemStatusObservation createProblemStatusObservation();

	/**
	 * Returns a new object of class '<em>Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Status Observation</em>'.
	 * @generated
	 */
	HealthStatusObservation createHealthStatusObservation();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Concern</em>'.
	 * @generated
	 */
	AllergyIntoleranceConcern createAllergyIntoleranceConcern();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	AllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry Reaction Observation Container</em>'.
	 * @generated
	 */
	ProblemEntryReactionObservationContainer createProblemEntryReactionObservationContainer();

	/**
	 * Returns a new object of class '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Reactions Section</em>'.
	 * @generated
	 */
	AllergiesReactionsSection createAllergiesReactionsSection();

	/**
	 * Returns a new object of class '<em>Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Dose</em>'.
	 * @generated
	 */
	NormalDose createNormalDose();

	/**
	 * Returns a new object of class '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tapered Dose</em>'.
	 * @generated
	 */
	TaperedDose createTaperedDose();

	/**
	 * Returns a new object of class '<em>Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Dose</em>'.
	 * @generated
	 */
	SplitDose createSplitDose();

	/**
	 * Returns a new object of class '<em>Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Dose</em>'.
	 * @generated
	 */
	ConditionalDose createConditionalDose();

	/**
	 * Returns a new object of class '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Medication</em>'.
	 * @generated
	 */
	CombinationMedication createCombinationMedication();

	/**
	 * Returns a new object of class '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Section</em>'.
	 * @generated
	 */
	VitalSignsSection createVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Vital Signs Section</em>'.
	 * @generated
	 */
	CodedVitalSignsSection createCodedVitalSignsSection();

	/**
	 * Returns a new object of class '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Sign Observation</em>'.
	 * @generated
	 */
	VitalSignObservation createVitalSignObservation();

	/**
	 * Returns a new object of class '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vital Signs Organizer</em>'.
	 * @generated
	 */
	VitalSignsOrganizer createVitalSignsOrganizer();

	/**
	 * Returns a new object of class '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payers Section</em>'.
	 * @generated
	 */
	PayersSection createPayersSection();

	/**
	 * Returns a new object of class '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Past Illness Section</em>'.
	 * @generated
	 */
	HistoryOfPastIllnessSection createHistoryOfPastIllnessSection();

	/**
	 * Returns a new object of class '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chief Complaint Section</em>'.
	 * @generated
	 */
	ChiefComplaintSection createChiefComplaintSection();

	/**
	 * Returns a new object of class '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason For Referral Section</em>'.
	 * @generated
	 */
	ReasonForReferralSection createReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Of Present Illness</em>'.
	 * @generated
	 */
	HistoryOfPresentIllness createHistoryOfPresentIllness();

	/**
	 * Returns a new object of class '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Surgeries Section</em>'.
	 * @generated
	 */
	SurgeriesSection createSurgeriesSection();

	/**
	 * Returns a new object of class '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Surgeries Section</em>'.
	 * @generated
	 */
	CodedSurgeriesSection createCodedSurgeriesSection();

	/**
	 * Returns a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Admission Diagnosis Section</em>'.
	 * @generated
	 */
	HospitalAdmissionDiagnosisSection createHospitalAdmissionDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diagnosis Section</em>'.
	 * @generated
	 */
	DischargeDiagnosisSection createDischargeDiagnosisSection();

	/**
	 * Returns a new object of class '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admission Medication History Section</em>'.
	 * @generated
	 */
	AdmissionMedicationHistorySection createAdmissionMedicationHistorySection();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Medications Section</em>'.
	 * @generated
	 */
	HospitalDischargeMedicationsSection createHospitalDischargeMedicationsSection();

	/**
	 * Returns a new object of class '<em>Coded Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Advance Directives Section</em>'.
	 * @generated
	 */
	CodedAdvanceDirectivesSection createCodedAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directives Section</em>'.
	 * @generated
	 */
	AdvanceDirectivesSection createAdvanceDirectivesSection();

	/**
	 * Returns a new object of class '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advance Directive Observation</em>'.
	 * @generated
	 */
	AdvanceDirectiveObservation createAdvanceDirectiveObservation();

	/**
	 * Returns a new object of class '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Narrative Section</em>'.
	 * @generated
	 */
	PhysicalExamNarrativeSection createPhysicalExamNarrativeSection();

	/**
	 * Returns a new object of class '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Exam Section</em>'.
	 * @generated
	 */
	PhysicalExamSection createPhysicalExamSection();

	/**
	 * Returns a new object of class '<em>General Appearance Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Appearance Section</em>'.
	 * @generated
	 */
	GeneralAppearanceSection createGeneralAppearanceSection();

	/**
	 * Returns a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visible Implanted Medical Devices Section</em>'.
	 * @generated
	 */
	VisibleImplantedMedicalDevicesSection createVisibleImplantedMedicalDevicesSection();

	/**
	 * Returns a new object of class '<em>Integumentary System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integumentary System Section</em>'.
	 * @generated
	 */
	IntegumentarySystemSection createIntegumentarySystemSection();

	/**
	 * Returns a new object of class '<em>Head Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head Section</em>'.
	 * @generated
	 */
	HeadSection createHeadSection();

	/**
	 * Returns a new object of class '<em>Eyes Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eyes Section</em>'.
	 * @generated
	 */
	EyesSection createEyesSection();

	/**
	 * Returns a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Nose Mouth Throat Section</em>'.
	 * @generated
	 */
	EarsNoseMouthThroatSection createEarsNoseMouthThroatSection();

	/**
	 * Returns a new object of class '<em>Ears Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ears Section</em>'.
	 * @generated
	 */
	EarsSection createEarsSection();

	/**
	 * Returns a new object of class '<em>Nose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nose Section</em>'.
	 * @generated
	 */
	NoseSection createNoseSection();

	/**
	 * Returns a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mouth Throat Teeth Section</em>'.
	 * @generated
	 */
	MouthThroatTeethSection createMouthThroatTeethSection();

	/**
	 * Returns a new object of class '<em>Neck Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neck Section</em>'.
	 * @generated
	 */
	NeckSection createNeckSection();

	/**
	 * Returns a new object of class '<em>Endocrine System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endocrine System Section</em>'.
	 * @generated
	 */
	EndocrineSystemSection createEndocrineSystemSection();

	/**
	 * Returns a new object of class '<em>Thorax Lungs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thorax Lungs Section</em>'.
	 * @generated
	 */
	ThoraxLungsSection createThoraxLungsSection();

	/**
	 * Returns a new object of class '<em>Chest Wall Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chest Wall Section</em>'.
	 * @generated
	 */
	ChestWallSection createChestWallSection();

	/**
	 * Returns a new object of class '<em>Breast Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Breast Section</em>'.
	 * @generated
	 */
	BreastSection createBreastSection();

	/**
	 * Returns a new object of class '<em>Heart Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heart Section</em>'.
	 * @generated
	 */
	HeartSection createHeartSection();

	/**
	 * Returns a new object of class '<em>Respiratory System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respiratory System Section</em>'.
	 * @generated
	 */
	RespiratorySystemSection createRespiratorySystemSection();

	/**
	 * Returns a new object of class '<em>Abdomen Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abdomen Section</em>'.
	 * @generated
	 */
	AbdomenSection createAbdomenSection();

	/**
	 * Returns a new object of class '<em>Lymphatic Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lymphatic Section</em>'.
	 * @generated
	 */
	LymphaticSection createLymphaticSection();

	/**
	 * Returns a new object of class '<em>Vessels Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vessels Section</em>'.
	 * @generated
	 */
	VesselsSection createVesselsSection();

	/**
	 * Returns a new object of class '<em>Musculoskeletal System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Musculoskeletal System Section</em>'.
	 * @generated
	 */
	MusculoskeletalSystemSection createMusculoskeletalSystemSection();

	/**
	 * Returns a new object of class '<em>Neurologic System Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neurologic System Section</em>'.
	 * @generated
	 */
	NeurologicSystemSection createNeurologicSystemSection();

	/**
	 * Returns a new object of class '<em>Genitalia Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genitalia Section</em>'.
	 * @generated
	 */
	GenitaliaSection createGenitaliaSection();

	/**
	 * Returns a new object of class '<em>Rectum Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectum Section</em>'.
	 * @generated
	 */
	RectumSection createRectumSection();

	/**
	 * Returns a new object of class '<em>Extremities Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extremities Section</em>'.
	 * @generated
	 */
	ExtremitiesSection createExtremitiesSection();

	/**
	 * Returns a new object of class '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Review Of Systems Section</em>'.
	 * @generated
	 */
	ReviewOfSystemsSection createReviewOfSystemsSection();

	/**
	 * Returns a new object of class '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Course Section</em>'.
	 * @generated
	 */
	HospitalCourseSection createHospitalCourseSection();

	/**
	 * Returns a new object of class '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Results Section</em>'.
	 * @generated
	 */
	CodedResultsSection createCodedResultsSection();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment And Plan Section</em>'.
	 * @generated
	 */
	AssessmentAndPlanSection createAssessmentAndPlanSection();

	/**
	 * Returns a new object of class '<em>Care Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Plan Section</em>'.
	 * @generated
	 */
	CarePlanSection createCarePlanSection();

	/**
	 * Returns a new object of class '<em>Family Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family Medical History Section</em>'.
	 * @generated
	 */
	FamilyMedicalHistorySection createFamilyMedicalHistorySection();

	/**
	 * Returns a new object of class '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Section</em>'.
	 * @generated
	 */
	SocialHistorySection createSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Encounter History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter History Section</em>'.
	 * @generated
	 */
	EncounterHistorySection createEncounterHistorySection();

	/**
	 * Returns a new object of class '<em>Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Devices Section</em>'.
	 * @generated
	 */
	MedicalDevicesSection createMedicalDevicesSection();

	/**
	 * Returns a new object of class '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Communication</em>'.
	 * @generated
	 */
	LanguageCommunication createLanguageCommunication();

	/**
	 * Returns a new object of class '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Summary</em>'.
	 * @generated
	 */
	MedicalSummary createMedicalSummary();

	/**
	 * Returns a new object of class '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Summary</em>'.
	 * @generated
	 */
	DischargeSummary createDischargeSummary();

	/**
	 * Returns a new object of class '<em>Coverage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coverage Entry</em>'.
	 * @generated
	 */
	CoverageEntry createCoverageEntry();

	/**
	 * Returns a new object of class '<em>Healthcare Providers Pharmacies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcare Providers Pharmacies</em>'.
	 * @generated
	 */
	HealthcareProvidersPharmacies createHealthcareProvidersPharmacies();

	/**
	 * Returns a new object of class '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immunization</em>'.
	 * @generated
	 */
	Immunization createImmunization();

	/**
	 * Returns a new object of class '<em>Observation Request Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Request Entry</em>'.
	 * @generated
	 */
	ObservationRequestEntry createObservationRequestEntry();

	/**
	 * Returns a new object of class '<em>Product Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Entry</em>'.
	 * @generated
	 */
	ProductEntry createProductEntry();

	/**
	 * Returns a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureEntryProcedureActivityProcedure createProcedureEntryProcedureActivityProcedure();

	/**
	 * Returns a new object of class '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	 * @generated
	 */
	ProcedureEntryPlanOfCareActivityProcedure createProcedureEntryPlanOfCareActivityProcedure();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Internal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Reference</em>'.
	 * @generated
	 */
	InternalReference createInternalReference();

	/**
	 * Returns a new object of class '<em>Patient Medical Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Medical Instructions</em>'.
	 * @generated
	 */
	PatientMedicalInstructions createPatientMedicalInstructions();

	/**
	 * Returns a new object of class '<em>Payer Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payer Entry</em>'.
	 * @generated
	 */
	PayerEntry createPayerEntry();

	/**
	 * Returns a new object of class '<em>PHR Extract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PHR Extract</em>'.
	 * @generated
	 */
	PHRExtract createPHRExtract();

	/**
	 * Returns a new object of class '<em>PHR Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PHR Update</em>'.
	 * @generated
	 */
	PHRUpdate createPHRUpdate();

	/**
	 * Returns a new object of class '<em>Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Activity</em>'.
	 * @generated
	 */
	EncounterActivity createEncounterActivity();

	/**
	 * Returns a new object of class '<em>Encounter Plan Of Care</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Plan Of Care</em>'.
	 * @generated
	 */
	EncounterPlanOfCare createEncounterPlanOfCare();

	/**
	 * Returns a new object of class '<em>Intake Output Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intake Output Section</em>'.
	 * @generated
	 */
	IntakeOutputSection createIntakeOutputSection();

	/**
	 * Returns a new object of class '<em>Supply Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply Entry</em>'.
	 * @generated
	 */
	SupplyEntry createSupplyEntry();

	/**
	 * Returns a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication Fullfillment Instructions</em>'.
	 * @generated
	 */
	MedicationFullfillmentInstructions createMedicationFullfillmentInstructions();

	/**
	 * Returns a new object of class '<em>Pregnancy History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy History Section</em>'.
	 * @generated
	 */
	PregnancyHistorySection createPregnancyHistorySection();

	/**
	 * Returns a new object of class '<em>Pregnancy Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregnancy Observation</em>'.
	 * @generated
	 */
	PregnancyObservation createPregnancyObservation();

	/**
	 * Returns a new object of class '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Contact Guardian</em>'.
	 * @generated
	 */
	PatientContactGuardian createPatientContactGuardian();

	/**
	 * Returns a new object of class '<em>Patient Contact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Contact Participant</em>'.
	 * @generated
	 */
	PatientContactParticipant createPatientContactParticipant();

	/**
	 * Returns a new object of class '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanned Document</em>'.
	 * @generated
	 */
	ScannedDocument createScannedDocument();

	/**
	 * Returns a new object of class '<em>Scan Original Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Original Author</em>'.
	 * @generated
	 */
	ScanOriginalAuthor createScanOriginalAuthor();

	/**
	 * Returns a new object of class '<em>Scanning Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scanning Device</em>'.
	 * @generated
	 */
	ScanningDevice createScanningDevice();

	/**
	 * Returns a new object of class '<em>Scan Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scan Data Enterer</em>'.
	 * @generated
	 */
	ScanDataEnterer createScanDataEnterer();

	/**
	 * Returns a new object of class '<em>Discharge Diet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discharge Diet</em>'.
	 * @generated
	 */
	DischargeDiet createDischargeDiet();

	/**
	 * Returns a new object of class '<em>Hospital Discharge Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Discharge Physical</em>'.
	 * @generated
	 */
	HospitalDischargePhysical createHospitalDischargePhysical();

	/**
	 * Returns a new object of class '<em>Coded Family Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Family Medical History Section</em>'.
	 * @generated
	 */
	CodedFamilyMedicalHistorySection createCodedFamilyMedicalHistorySection();

	/**
	 * Returns a new object of class '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Organizer</em>'.
	 * @generated
	 */
	FamilyHistoryOrganizer createFamilyHistoryOrganizer();

	/**
	 * Returns a new object of class '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Family History Observation</em>'.
	 * @generated
	 */
	FamilyHistoryObservation createFamilyHistoryObservation();

	/**
	 * Returns a new object of class '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social History Observation</em>'.
	 * @generated
	 */
	SocialHistoryObservation createSocialHistoryObservation();

	/**
	 * Returns a new object of class '<em>Coded Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Reason For Referral Section</em>'.
	 * @generated
	 */
	CodedReasonForReferralSection createCodedReasonForReferralSection();

	/**
	 * Returns a new object of class '<em>Coded Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coded Social History Section</em>'.
	 * @generated
	 */
	CodedSocialHistorySection createCodedSocialHistorySection();

	/**
	 * Returns a new object of class '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Status Section</em>'.
	 * @generated
	 */
	FunctionalStatusSection createFunctionalStatusSection();

	/**
	 * Returns a new object of class '<em>Procedures And Interventions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedures And Interventions Section</em>'.
	 * @generated
	 */
	ProceduresAndInterventionsSection createProceduresAndInterventionsSection();

	/**
	 * Returns a new object of class '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registry Delegate</em>'.
	 * @generated
	 */
	IHERegistryDelegate createIHERegistryDelegate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IHEPackage getIHEPackage();

} // IHEFactory
