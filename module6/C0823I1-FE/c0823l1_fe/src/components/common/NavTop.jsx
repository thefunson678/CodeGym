import React, { useState, useEffect } from 'react';
import "bootstrap-icons/font/bootstrap-icons.css"; // Correctly import Bootstrap Icons CSS
import "../assets/bootstrap/css/bootstrap.min.css";
import usernameAva from "../assets/img/avatars/avatar5.jpeg";
import UserService from "../service/UserService";
export default function NavTop() {
    const [profileInfo, setProfileInfo] = useState({});
    useEffect(() => {
        fetchProfileInfo();
    }, []);

    const fetchProfileInfo = async () => {
        try {
            const token = localStorage.getItem('token'); // Retrieve the token from localStorage
            const response = await UserService.getYourProfile(token);
            setProfileInfo(response.userDto);
        } catch (error) {
            console.error('Error fetching profile information:', error);
        }
    };

    return (
                <nav className="navbar navbar-expand bg-white shadow mb-4 topbar">
                    <div className="container-fluid">
                        <ul className="navbar-nav flex-nowrap ms-auto">
                            <li className="nav-item dropdown no-arrow mx-1">
                                <div className="shadow dropdown-list dropdown-menu dropdown-menu-end" aria-labelledby="alertsDropdown"></div>
                            </li>
                            <div className="d-none d-sm-block topbar-divider"></div>
                            <li className="nav-item dropdown no-arrow" style={{ height: '105.6px' }}><span className="d-none d-lg-inline me-2 text-gray-600 small"><br />Xin chào ,{profileInfo.username}</span><img alt="avatar"  className="border rounded-circle img-profile" src={usernameAva} /></li>
                        </ul>
                    </div>
                </nav>
    );
}