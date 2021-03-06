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
 * A representation of the model object '<em><b>Historyof Infection Fetal Death Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage#getHistoryofInfectionFetalDeathSection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='History of Infection: Fetal Death Section'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='History of Infection: Fetal Death SectionTemplateId History of Infection: Fetal Death SectionCode History of Infection: Fetal Death SectionInfectionPresentFetalDeath' templateId.root='2.16.840.1.113883.10.20.26.48' classCode='DOCSECT' moodCode='EVN' code.code='71459-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Infection Panel'"
 * @generated
 */
public interface HistoryofInfectionFetalDeathSection extends org.eclipse.mdht.uml.cda.Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='History of Infection: Fetal Death SectionTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.26.48\')'"
	 * @generated
	 */
	boolean validateHistoryofInfectionFetalDeathSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='History of Infection: Fetal Death SectionCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'71459-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateHistoryofInfectionFetalDeathSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='History of Infection: Fetal Death SectionInfectionPresentFetalDeath'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfectionPresentFetalDeath))'"
	 * @generated
	 */
	boolean validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfectionPresentFetalDeath)).oclAsType(vsbr::InfectionPresentFetalDeath)'"
	 * @generated
	 */
	EList<InfectionPresentFetalDeath> getInfectionPresentFetalDeaths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionFetalDeathSection init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryofInfectionFetalDeathSection init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // HistoryofInfectionFetalDeathSection
