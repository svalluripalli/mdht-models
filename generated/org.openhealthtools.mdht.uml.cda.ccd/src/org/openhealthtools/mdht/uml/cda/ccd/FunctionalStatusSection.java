/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     <i>Functional Status</i> describes the patient's status of normal functioning at the time the Care Record
 *     was created. Functional statuses include information regarding the patient relative to:
 * </p>
 *
 *     <ul><li>Ambulatory ability</li>
 *        <li>Mental status or competency</li>
 *         <li>Activities of Daily Living (ADLs), including bathing, dressing, feeding, grooming</li>
 *         <li>Home / living situation having an effect on the health status of the patient</li>
 *         <li>Ability to care for self</li>
 *         <li>Social activity, including issues with social cognition, participation with
 *         friends and acquaintances other than family members</li>
 *        <li>Occupation activity, including activities partly or directly related to working, housework or volunteering, family
 *         and home responsibilities or activities related to home and family</li>
 *       <li>Communication ability, including issues with speech, writing or cognition required for communication</li>
 *        <li> Perception, including sight, hearing, taste, skin sensation, kinesthetic sense, proprioception, or
 *         balance</li>
 * </ul>
 * <p>
 *     Any
 *     deviation from normal function that the patient displays and is recorded in the record should be included. Of
 *     particular interest are those limitations that would in any way interfere with self care or the medical therapeutic
 *     process. In addition, an improvement, any change in or noting that the patient has normal functioning status is also
 *     valid for inclusion.
 * </p>
 * <p>Functional Statuses can be expressed in 3 different forms. They can occur as a Problem, a Result or as text. Text can be employed if and only if the Functional Status is neither a Problem nor a Result. Functional Statuses expressed as Problems include relevant clinical conditions, diagnoses, symptoms and findings. Results are the interpretation or conclusion derived from a clinical assessment or test battery, such as the Instrumental Activities of Daily Living (IADL) scale or the Functional Status Index (FSI).
 * </p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getFunctionalStatusSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FunctionalStatusSectionTemplateId FunctionalStatusSectionObservationCode FunctionalStatusSectionProblemStatusObservation FunctionalStatusSectionResultStatusObservation FunctionalStatusSectionCode FunctionalStatusSectionTitle FunctionalStatusSectionText' templateId.root='2.16.840.1.113883.10.20.1.5' constraints.validation.warning='FunctionalStatusSectionClinicalStatements' constraints.validation.info='FunctionalStatusSectionObservationCodeValueSet FunctionalStatusSectionValueDatatype FunctionalStatusSectionIcfCodeSystem' code.code='47420-5' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Functional status assessment'"
 * @generated
 */
public interface FunctionalStatusSection extends Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEntryTargets(ccd::ProblemAct)->size() > 0\r\n  or self.getEntryTargets(ccd::ResultOrganizer)->size() > 0'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionClinicalStatements(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation) or obs.oclIsKindOf(ccd::ResultObservation))->forAll(ob : cda::Observation| ob.code->size() = 1)'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation) or obs.oclIsKindOf(ccd::ResultObservation))->forAll(ob : cda::Observation| ob.code.codeSystem = \'2.16.840.1.113883.6.96\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionObservationCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(o | o.value->select(v | v.oclIsKindOf(datatypes::CD)  or  v.oclIsKindOf(datatypes::CE) ) ->isEmpty())->isEmpty()'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionValueDatatype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(o|o.code.codeSystem <> \'2.16.840.1.113883.6.254\')->isEmpty()'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionIcfCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(obs : cda::Observation | (obs.oclIsKindOf(ccd::ResultObservation) or obs.oclIsKindOf(ccd::ProblemObservation)))->forAll(ob : cda::Observation | ob.getObservations()->select(o: cda::Observation | o.oclIsKindOf(ccd::FunctionalStatusObservation))->size() = 1)'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(obs : cda::Observation | (obs.oclIsKindOf(ccd::ResultObservation) or obs.oclIsKindOf(ccd::ProblemObservation)))->\r\nforAll(ob : cda::Observation | ob.getObservations()->select(o: cda::Observation | o.oclIsKindOf(ccd::FunctionalStatusObservation))->size() = 1)'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionResultStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.5\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \nvalue.code = \'47420-5\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateFunctionalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // FunctionalStatusSection
