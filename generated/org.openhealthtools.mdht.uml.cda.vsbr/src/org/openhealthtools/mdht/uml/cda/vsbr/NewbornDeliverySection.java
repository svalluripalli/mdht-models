/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Newborn Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getNewbornDeliverySection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Newborn Delivery SectionTemplateId Newborn Delivery SectionClassCode Newborn Delivery SectionMoodCode Newborn Delivery SectionCode Newborn Delivery SectionText Newborn Delivery SectionSubject Newborn Delivery SectionCongenitalAnomalies Newborn Delivery SectionNewbornsVitalSignsSection Newborn Delivery SectionAbnormalConditionsOfTheNewborn Newborn Delivery SectionInfantLiving Newborn Delivery SectionInfantBreastfed Newborn Delivery SectionPlurality Newborn Delivery SectionAssessmentsSection Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject Newborn Delivery SectionNewbornSubjectTypeCode Newborn Delivery SectionNewbornSubjectRelatedSubject' templateId.root='2.16.840.1.113883.10.20.26.10' classCode='DOCSECT' moodCode='EVN' code.code='57075-4' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Newborn delivery information from newborn narrative' constraints.validation.info='Newborn Delivery SectionBirthOrder Newborn Delivery SectionNumberOfInfantsBornAlive Newborn Delivery SectionInfantTransfer' constraints.validation.query='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject Newborn Delivery SectionNewbornSubjectTypeCode Newborn Delivery SectionNewbornSubjectRelatedSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubject typeCode='SBJ' constraints.validation.error='Newborn Delivery SectionNewbornSubjectTypeCode Newborn Delivery SectionNewbornSubjectRelatedSubject'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewborn classCode='PRS' constraints.validation.error='Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject' code.code='CHILD' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/vsbrNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewborn classCode='PSN' constraints.validation.error='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime' determinerCode='INSTANCE' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' administrativeGenderCode.codeSystemName='AdministrativeGenderCode'"
 * @generated
 */
public interface NewbornDeliverySection extends org.eclipse.mdht.uml.cda.Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.10\')'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'classCode\') and self.classCode=vocab::ActClass::DOCSECT'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionMoodCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\') and self.moodCode=vocab::ActMood::EVN'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'57075-4\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionText'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionSubject'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionBirthOrder'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::BirthOrder) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNumberOfInfantsBornAlive'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNumberOfInfantsBornAlive(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionCongenitalAnomalies'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::CongenitalAnomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionCongenitalAnomalies(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornsVitalSignsSection'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::NewbornsVitalSignsSection))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornsVitalSignsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionAbnormalConditionsOfTheNewborn'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::AbnormalConditionoftheNewborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionAbnormalConditionsOfTheNewborn(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionInfantLiving'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantLiving) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionInfantLiving(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionInfantBreastfed'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantBreastfed) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionInfantBreastfed(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionInfantTransfer'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantTransfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionInfantTransfer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionPlurality'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionAssessmentsSection'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::AssessmentsSection))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionAssessmentsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClass::PSN)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined(\'determinerCode\') and determinerCode=vocab::EntityDeterminer::INSTANCE)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornSDTCId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (sDTCId->size() = 1))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornName'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1\'))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornNewbornBirthTime'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornClassCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::x_DocumentSubject::PRS)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.code = \'CHILD\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRoleOfNewbornSubject'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationTargetSubject::SBJ)'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Newborn Delivery SectionNewbornSubjectRelatedSubject'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))'"
	 * @generated
	 */
	boolean validateNewbornDeliverySectionNewbornSubjectRelatedSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::BirthOrder))->asSequence()->any(true).oclAsType(vsbr::BirthOrder)'"
	 * @generated
	 */
	BirthOrder getBirthOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive))->asSequence()->any(true).oclAsType(vsbr::NumberofInfantsBornAlive)'"
	 * @generated
	 */
	NumberofInfantsBornAlive getNumberOfInfantsBornAlive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CongenitalAnomaly)).oclAsType(vsbr::CongenitalAnomaly)'"
	 * @generated
	 */
	EList<CongenitalAnomaly> getCongenitalAnomaliess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::NewbornsVitalSignsSection))->asSequence()->any(true).oclAsType(vsbr::NewbornsVitalSignsSection)'"
	 * @generated
	 */
	NewbornsVitalSignsSection getNewbornsVitalSignsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::AbnormalConditionoftheNewborn)).oclAsType(vsbr::AbnormalConditionoftheNewborn)'"
	 * @generated
	 */
	EList<AbnormalConditionoftheNewborn> getAbnormalConditionsOfTheNewborns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantLiving))->asSequence()->any(true).oclAsType(vsbr::InfantLiving)'"
	 * @generated
	 */
	InfantLiving getInfantLiving();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantBreastfed))->asSequence()->any(true).oclAsType(vsbr::InfantBreastfed)'"
	 * @generated
	 */
	InfantBreastfed getInfantBreastfed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantTransfer))->asSequence()->any(true).oclAsType(vsbr::InfantTransfer)'"
	 * @generated
	 */
	InfantTransfer getInfantTransfer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)'"
	 * @generated
	 */
	Plurality getPlurality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::AssessmentsSection))->asSequence()->any(true).oclAsType(vsbr::AssessmentsSection)'"
	 * @generated
	 */
	AssessmentsSection getAssessmentsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornDeliverySection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewbornDeliverySection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // NewbornDeliverySection
