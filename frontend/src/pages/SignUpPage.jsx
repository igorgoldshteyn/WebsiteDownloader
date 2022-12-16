import React from 'react'
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';

export function SignUpPage() {

    return (
        <>
            <Form>
                <Form.Group className="mb-3" controlId="firstName">
                    <Form.Label>First name</Form.Label>
                    <Form.Control type="text" placeholder="Enter your first name" />
                </Form.Group>

                <Form.Group className="mb-3" controlId="lastName">
                    <Form.Label>Last name</Form.Label>
                    <Form.Control type="text" placeholder="Enter your last name" />
                </Form.Group>

                <Form.Group className="mb-3" controlId="dateOfBirth">
                    <Form.Label>Date of birth</Form.Label>
                    <Form.Control type="date" placeholder="Enter your Date of birth" />
                </Form.Group>

                <Form.Group className="mb-3" controlId="login">
                    <Form.Label>Login</Form.Label>
                    <Form.Control type="text" placeholder="Enter your login" />
                </Form.Group>

                <Form.Group className="mb-3" controlId="password">
                    <Form.Label>Password</Form.Label>
                    <Form.Control type="password" placeholder="Enter your password" />
                </Form.Group>

                <Button variant="primary" type="submit">
                    Submit
                </Button>

            </Form>
        </>
    )
}
