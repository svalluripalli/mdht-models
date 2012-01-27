/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;

import org.openhealthtools.mdht.uml.cda.consol.operations.ExternalReferenceOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceImpl extends ActImpl implements ExternalReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.EXTERNAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceHasNoCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceHasNoCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceHasReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceHasReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceHasReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocument(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceHasReferenceExternalDocumentID(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocumentID(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceHasReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceHasReferenceExternalDocumentText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExternalReferenceOperations.validateExternalReferenceText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference init() {
    	CDAUtil.init(this);
    	return this;
	}
} // ExternalReferenceImpl
