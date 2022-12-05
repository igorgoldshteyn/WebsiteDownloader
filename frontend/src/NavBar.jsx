import React from 'react';
import {Link} from 'react-router-dom';
import './styles.css'




export function NavBar() {
	return (
		<>
			<div className='navBar'>
				<Link to="/">Main Page</Link>
				<Link to="/features">Features</Link>
				<Link to="/about">About</Link>
				<Link to="/pricing">Pricing</Link>
				<Link to="/signIn">Sign In</Link>

			</div>
		</>
	);
}
