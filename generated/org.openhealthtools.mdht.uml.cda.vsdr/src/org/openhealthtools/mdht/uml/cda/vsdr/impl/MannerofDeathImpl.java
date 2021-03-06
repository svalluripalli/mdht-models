/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.MannerofDeathOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mannerof Death</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MannerofDeathImpl extends ObservationImpl implements MannerofDeath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MannerofDeathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsdrPackage.Literals.MANNEROF_DEATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMannerofDeathValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MannerofDeathOperations.validateMannerofDeathValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MannerofDeath init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MannerofDeath init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MannerofDeathImpl
