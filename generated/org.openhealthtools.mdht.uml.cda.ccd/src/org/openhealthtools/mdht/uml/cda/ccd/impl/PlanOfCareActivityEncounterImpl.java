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
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.EncounterImpl;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityEncounterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity Encounter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlanOfCareActivityEncounterImpl extends EncounterImpl implements PlanOfCareActivityEncounter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivityEncounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_ENCOUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterMoodCodeValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterMoodCodeValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityEncounter init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PlanOfCareActivityEncounterImpl
