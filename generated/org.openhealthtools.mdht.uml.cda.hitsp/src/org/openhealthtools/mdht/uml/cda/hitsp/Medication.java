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
package org.openhealthtools.mdht.uml.cda.hitsp;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage#getMedication()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='HITSPMedicationTemplateId HITSPMedicationFirstEffectiveTimeDatatype HITSPMedicationHasMedicationInformation HITSPMedicationHasIndicationNarrativeText HITSPMedicationHasIndicationVocab HITSPMedicationMedicationVehicleType HITSPMedicationMedicationVehicleClass HITSPMedicationMedicationVehicleCode HITSPMedicationMedicationVehicleName HITSPMedicationMedicationVehicleCodedNameVocab HITSPMedicationRouteCode MedicationApproachSiteCode' templateId.root='2.16.840.1.113883.3.88.11.83.8' contextDependent='true' constraints.validation.info='HITSPMedicationDoseUnits HITSPMedicationDeliveryMethodDescription HITSPMedicationHasStatusOfMedication HITSPMedicationHasIndication HITSPMedicationHasPatientInstructions HITSPMedicationHasMedicationVehicle HITSPMedicationMedicationVehicleCodedName HITSPMedicationEffectiveTime HITSPMedicationRouteCodeP MedicationDoseQuantity HITSPMedicationAdministrationUnitCode HITSPMedicationMaxDoseQuantity MedicationApproachSiteCodeP MedicationCode' routeCode.codeSystem='2.16.840.1.113883.3.26.1.1' routeCode.codeSystemName='NCI Thesaurus' approachSiteCode.codeSystem='2.16.840.1.113883.6.96' approachSiteCode.codeSystemName='SNOMEDCT' constraints.validation.dependOn.MedicationApproachSiteCode='MedicationApproachSiteCodeP'"
 * @generated
 */
public interface Medication extends org.openhealthtools.mdht.uml.cda.ihe.Medication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->exists (ef : datatypes::SXCM_TS | not ef.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationFirstEffectiveTimeDatatype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.doseQuantity->exists(dq : datatypes::IVL_PQ | dq.unit=\'2.16.840.1.113883.3.88.12.80.29\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationDoseUnits(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.originalText.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateHITSPMedicationDeliveryMethodDescription(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.consumable.manufacturedProduct->exists(mp : cda::ManufacturedProduct | mp.oclIsKindOf(hitsp::MedicationInformation))'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasMedicationInformation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation |  po.oclIsKindOf(ccd::MedicationStatusObservation))'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasStatusOfMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation | po.oclIsKindOf(ccd::ProblemObservation))'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation | po.oclIsKindOf(ccd::ProblemObservation) and not po.text.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndicationNarrativeText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->exists(po : cda::Observation | po.oclIsKindOf(ccd::ProblemObservation) and po.code.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasIndicationVocab(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->exists(po : cda::Act | po.oclIsKindOf(ihe::PatientMedicalInstructions))'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasPatientInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0)'"
	 * @generated
	 */
	boolean validateHITSPMedicationHasMedicationVehicle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleType(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleClass(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\')))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.name->size() > 0)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode =vocab::ParticipationType::CSM and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.code->size() > 0)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCodedName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant.participantRole->size() > 0) implies self.getSubstanceAdministrations()->exists(sa : cda::SubstanceAdministration | sa.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::CSM and par.participantRole->exists(pr : cda::ParticipantRole | pr.classCode = vocab::RoleClassRoot::MANU and pr.code.code = \'412307009\' and pr.code.codeSystem = \'2.16.840.1.113883.6.96\' and pr.playingEntity.code->size() > 0 and pr.playingEntity.code.codeSystem = \'2.16.840.1.113883.6.96\')))'"
	 * @generated
	 */
	boolean validateHITSPMedicationMedicationVehicleCodedNameVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.3.88.11.83.8\')'"
	 * @generated
	 */
	boolean validateHITSPMedicationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime->isEmpty() or self.effectiveTime->exists(element | element.isNullFlavorUndefined())) implies (not self.effectiveTime->isEmpty() and self.effectiveTime->forAll(element | element.oclIsTypeOf(datatypes::IVL_TS)))'"
	 * @generated
	 */
	boolean validateHITSPMedicationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.3.26.1.1\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationRouteCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.routeCode.oclIsUndefined() or self.routeCode.isNullFlavorUndefined()) implies (not self.routeCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationRouteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.administrationUnitCode.oclIsUndefined() or self.administrationUnitCode.isNullFlavorUndefined()) implies (not self.administrationUnitCode.oclIsUndefined() and self.administrationUnitCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.administrationUnitCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationAdministrationUnitCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.maxDoseQuantity.oclIsUndefined() or self.maxDoseQuantity.isNullFlavorUndefined()) implies (not self.maxDoseQuantity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateHITSPMedicationMaxDoseQuantity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.approachSiteCode->isEmpty() or self.approachSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.approachSiteCode->isEmpty())'"
	 * @generated
	 */
	boolean validateMedicationApproachSiteCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hitsp::MedicationType))->asSequence()->any(true).oclAsType(hitsp::MedicationType)'"
	 * @generated
	 */
	MedicationType getMedicationType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(hitsp::MedicationOrderInformation)).oclAsType(hitsp::MedicationOrderInformation)'"
	 * @generated
	 */
	EList<MedicationOrderInformation> getMedicationOrderInformations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->any(true).oclAsType(ccd::ReactionObservation)'"
	 * @generated
	 */
	ReactionObservation getHITSPReactionObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // Medication
