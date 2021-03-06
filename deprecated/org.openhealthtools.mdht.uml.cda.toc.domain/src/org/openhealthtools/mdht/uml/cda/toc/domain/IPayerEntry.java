/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain;

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payer Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntry#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPayerEntry()
 * @generated
 */
public interface IPayerEntry {
	/**
	 * Returns the value of the '<em><b>CDA Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDA Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDA Type</em>' reference.
	 * @see #setCDAType(Act)
	 * @see org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage#getPayerEntry_CDAType()
	 * @generated
	 */
	Act getCDAType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.toc.domain.IPayerEntry#getCDAType <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDA Type</em>' reference.
	 * @see #getCDAType()
	 * @generated
	 */
	void setCDAType(Act value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::id.
	 * self.id.oclAsType(datatypes::II)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	EList<II> getIds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain at least one [1..*] id (CONF-51).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	II addId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain at least one [1..*] id (CONF-51).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry addId(II value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Act::code.
	 * self.code.oclAsType(datatypes::CD)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.1.11.19832 ActCoverageType DYNAMIC (CONF-54, CONF-55).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	CD withCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHOULD contain exactly one [1..1] code, which SHOULD be selected from ValueSet 2.16.840.1.113883.1.11.19832 ActCoverageType DYNAMIC (CONF-54, CONF-55).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PolicyActivity::payerEntity.
	 * self.getAssignedEntities()->select(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(domain::PayerEntity))->asSequence()->first().oclAsType(domain::PayerEntity)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntity getPayerEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain exactly one [1..1] performer (CONF-56), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntity withPayerEntity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain exactly one [1..1] performer (CONF-56), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry setPayerEntity(IPayerEntity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PolicyActivity::coveredParty.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::CoveredParty))->asSequence()->first().oclAsType(domain::CoveredParty)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICoveredParty getCoveredParty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain exactly one [1..1] participant (CONF-58), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ICoveredParty withCoveredParty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity SHALL contain exactly one [1..1] participant (CONF-58), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry setCoveredParty(ICoveredParty value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ccd::PolicyActivity::subscriber.
	 * self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::PolicySubscriber))->asSequence()->first().oclAsType(domain::PolicySubscriber)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPolicySubscriber getSubscriber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity MAY contain exactly one [1..1] participant (CONF-63), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPolicySubscriber withSubscriber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CCD Policy Activity MAY contain exactly one [1..1] participant (CONF-63), such that.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	IPayerEntry setSubscriber(IPolicySubscriber value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPayerEntry init();
} // IPayerEntry
