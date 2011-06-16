/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.domain;

import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Combination Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage#getMedicationCombinationMedication()
 * @generated
 */
public interface IMedicationCombinationMedication extends IMedication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity SHALL contain at least one [1..*] id (CONF-306).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication SHOULD contain zero or one [0..1] rateQuantity.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setRateQuantity(IVL_PQ value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CDA Substance Administration Contains exactly one [1..1] consumable, where its type is Consumable.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setConsumable(Consumable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-338, CONF-339), such that Contains @typeCode="SUBJ" SUBJ (has subject), and Contains exactly one [1..1] Medication Series Number Observation (templateId: 2.16.840.1.113883.10.20.1.46).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setMedicationSeriesNumberObservation(MedicationSeriesNumberObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain exactly one [1..1] entryRelationship (CONF-350), such that Contains exactly one [1..1] Medication Status Observation (templateId: 2.16.840.1.113883.10.20.1.47).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setMedicationStatusObservation(MedicationStatusObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] performer (CONF-313), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addPerformer(Performer2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] entryRelationship (CONF-348, CONF-349), such that Contains @typeCode="CAUS" CAUS (is etiology for), and Contains exactly one [1..1] Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addReactionObservation(ReactionObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Medication Activity MAY contain at least one [1..*] participant (CONF-368), such that Contains exactly one [1..1] Product Instance (templateId: 2.16.840.1.113883.10.20.1.52).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addProductInstance(ProductInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Internal Reference (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.4.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addInternalReference(InternalReference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IHE Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Patient Medical Instructions (templateId: 1.3.6.1.4.1.19376.1.5.3.1.4.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addPatientMedicalInstructions(PatientMedicalInstructions value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] Medication Type (templateId: 2.16.840.1.113883.3.88.11.83.8.1).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setMedicationType(IMedicationType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains at least one [1..*] entryRelationship, such that Contains exactly one [1..1] Medication Order Information (templateId: 2.16.840.1.113883.3.88.11.83.8.3).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication addMedicationOrderInformation(IMedicationOrderInformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HITSP Medication Contains zero or one [0..1] entryRelationship, such that Contains exactly one [1..1] CCD Reaction Observation (templateId: 2.16.840.1.113883.10.20.1.54).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IMedicationCombinationMedication setReactionObservation(ReactionObservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationCombinationMedication init();
} // IMedicationCombinationMedication
