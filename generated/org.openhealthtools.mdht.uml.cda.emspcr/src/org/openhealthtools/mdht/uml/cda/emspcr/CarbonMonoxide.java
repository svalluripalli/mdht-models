/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carbon Monoxide</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getCarbonMonoxide()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CarbonMonoxideTemplateId CarbonMonoxideMoodCode CarbonMonoxideCode CarbonMonoxideCodeP CarbonMonoxideValue' templateId.root='2.16.840.1.1133883.17.3.10.1.167' moodCode='EVN' code.code='20563-3' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Carboxyhemoglobin/???Hemoglobin.total in Blood' constraints.validation.dependOn.CarbonMonoxideCode='CarbonMonoxideCodeP' constraints.validation.info='CarbonMonoxideEffectiveTime'"
 * @generated
 */
public interface CarbonMonoxide extends org.eclipse.mdht.uml.cda.Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.167\')'"
	 * @generated
	 */
	boolean validateCarbonMonoxideTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	 * @generated
	 */
	boolean validateCarbonMonoxideMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCarbonMonoxideCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.code = \'20563-3\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCarbonMonoxideCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCarbonMonoxideEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))'"
	 * @generated
	 */
	boolean validateCarbonMonoxideValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbonMonoxide init();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CarbonMonoxide init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // CarbonMonoxide
