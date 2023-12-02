/**
 */
package org.rm2pt.chatbot.metamodel.chatbot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.chatbot.metamodel.chatbot.User#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.chatbot.metamodel.chatbot.User#getChat <em>Chat</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends Admin, NormalUser {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.chatbot.metamodel.chatbot.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Chat</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.chatbot.metamodel.chatbot.Chat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chat</em>' reference list.
	 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage#getUser_Chat()
	 * @model
	 * @generated
	 */
	EList<Chat> getChat();

} // User
