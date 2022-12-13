import React from 'react'


export function SignUpPage() {
    return (
        <>
            <form action="/signUp" method="get">
                <text>First name:</text>
                <input type="text"/>
                <br/>
                <text>Last name:</text>
                <input type="text"/>
                <br/>
                <text>Date of birth:</text>
                <input type="date"/>
                <br/>
                <text>Login:</text>
                <input type="text"/>
                <br/>
                <text>Password:</text>
                <input type="password"/>
                <br/>
                <input type="submit" value={"Sign Up"}/>

            </form>
        </>
    )
}
