import React from 'react';
import ReactDOM from 'react-dom/client';

import NavBar from './NavBar';
import LinkInput from './LinkInput';
import Footer from './Footer';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
	<React.StrictMode>
		<NavBar />
		<LinkInput />
		<Footer />
	</React.StrictMode>
);
