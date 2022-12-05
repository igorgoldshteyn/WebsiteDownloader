import React from 'react'
import { Link } from 'react-router-dom';


export function SignInPage() {
    return (
        <>
            <form >
                <label for="login">Login:</label>
                <input type="text" />
                <br />
                <label for="Password">Password:</label>
                <input type="text" />
                <br />
                <input type="submit" value="Sign in" />
            </form>
        </>
    )
}
