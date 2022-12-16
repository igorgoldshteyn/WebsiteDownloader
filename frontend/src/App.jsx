import React from 'react';

import { Routes, Route, Link } from "react-router-dom";

import { NavBar } from './components/NavBar';
import { Footer } from './components/Footer';
import { MainPage } from './pages/MainPage';
import { FeaturesPage } from './pages/FeaturesPage';
import { AboutPage } from './pages/AboutPage';
import { SignInPage } from './pages/SignInPage';
import { SignUpPage } from './pages/SignUpPage';
import { PricingPage } from './pages/PricingPage';
// import './styles.css'

function App() {
    return (
        <>
            <NavBar />
            <Routes>
                <Route path="/" element={<MainPage />} />
                <Route path="/features" element={<FeaturesPage />} />
                <Route path="/about" element={<AboutPage />} />
                <Route path="/pricing" element={<PricingPage />} />
                <Route path="/signIn" element={<SignInPage />} />
                <Route path="/signUp" element={<SignUpPage />} />




            </Routes>
            <Footer />

        </>

    );
}

export default App;
