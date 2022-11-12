import React from 'react';
import ReactDOM from 'react-dom/client';

import NavBar from './NavBar';
import LinkInput from './LinkInput';
import Footer from './Footer';

import './styles.css'


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
	<>

		<NavBar />
		<LinkInput />
		<div className='footer'>
		<Footer  />
		</div>
	</>
);
