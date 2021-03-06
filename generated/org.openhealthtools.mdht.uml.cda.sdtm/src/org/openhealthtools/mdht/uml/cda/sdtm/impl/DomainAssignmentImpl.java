/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DomainAssignmentOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DomainAssignmentImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DomainAssignment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdtmPackage.Literals.DOMAIN_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateDomainAssignmentValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DomainAssignmentOperations.validateDomainAssignmentValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainAssignment init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public DomainAssignment init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} //DomainAssignmentImpl
