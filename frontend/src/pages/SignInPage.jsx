import React from 'react'
import { Link } from "react-router-dom";
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import { LinkContainer } from 'react-router-bootstrap';


export function SignInPage() {
  return (
    <>
      <Form className='col-2'  >
        <Form.Group className="mb-3" controlId="formBasicEmail">
          <Form.Label>Email</Form.Label>
          <Form.Control type="email" placeholder="Enter email" />
        </Form.Group>

        <Form.Group className="mb-3" controlId="formBasicPassword">
          <Form.Label>Password</Form.Label>
          <Form.Control type="password" placeholder="Password" />
        </Form.Group>
        <Button variant="primary" type="submit">Submit</Button>
        <LinkContainer to="/signUp">
          <Link>Sign up</Link>
        </LinkContainer>

      </Form>
      {/* <form method='post' action="http://localhost:8080/signIn">
                <label for="login">Login:</label>
                <input type="text" name='login' />
                <br />
                <label for="Password">Password:</label>
                <input type="text" name='password' />
                <br />
                <input type="submit" value="Sign in" />
            </form>

             <Link to="/signUp">Sign up</Link> */}

      {/* <Route path="/" element={<MainPage />} /> */}

      {/*<form action="http://localhost:3000/signUp" method="get">*/}
      {/*    <button name="" value="">Sign up</button>*/}
      {/*</form>*/}
    </>
  )
}


// another version
// const Register = () => {
//   const user = useUser();
//   const navigate = useNavigate();
//   const [username, setUsername] = useState("");
//   const [password, setPassword] = useState("");
//   const [name, setName] = useState("");

//   useEffect(() => {
//     if (user.jwt) navigate("/dashboard");
//   }, [user]);

//   function createAndLoginUser() {
//     const reqBody = {
//       username: username,
//       password: password,
//       name: name,
//     };

//     fetch("api/users/register", {
//       headers: {
//         "Content-Type": "application/json",
//       },
//       method: "post",
//       body: JSON.stringify(reqBody),
//     })
//       .then((response) => {
//         if (response.status === 200)
//           return Promise.all([response.json(), response.headers]);
//         else return Promise.reject("Invalid login attempt");
//       })
//       .then(([body, headers]) => {
//         user.setJwt(Cookies.get("jwt"));
//       })
//       .catch((message) => {
//         alert(message);
//       });
//   }

//   return (
//     <div>
//       <Container className="mt-5 ">
//         <Row className="justify-content-center">
//           <Col md="8" lg="6">
//             <Form.Group className="mb-3" controlId="name">
//               <Form.Label className="fs-4">Full Name</Form.Label>
//               <Form.Control

//                 type="text"

//                 size="lg"
//                 placeholder="John Doe"
//                 value={name}
//                 onChange={(e) => setName(e.target.value)}
//               />
//             </Form.Group>
//           </Col>
//         </Row>

//         <Row className="justify-content-center">
//           <Col md="8" lg="6">
//             <Form.Group className="mb-3" controlId="username">
//               <Form.Label className="fs-4">Username</Form.Label>
//               <Form.Control
//                 type="email"
//                 size="lg"
//                 placeholder="dogPoop@email.com"
//                 value={username}
//                 onChange={(e) => setUsername(e.target.value)}
//               />
//             </Form.Group>
//           </Col>
//         </Row>

//         <Row className="justify-content-center">
//           <Col md="8" lg="6">
//             <Form.Group className="mb-3" controlId="password">
//               <Form.Label className="fs-4">Password</Form.Label>
//               <Form.Control
//                 type="password"
//                 size="lg"
//                 placeholder="Type in your password"
//                 value={password}
//                 onChange={(e) => setPassword(e.target.value)}
//               />
//             </Form.Group>
//           </Col>
//         </Row>
//         <Row className="justify-content-center">
//           <Col
//             md="8"
//             lg="6"
//             className="mt-2 d-flex flex-column gap-5 flex-md-row justify-content-md-between"
//           >
//             <Button
//               id="submit"
//               type="button"
//               size="lg"

//               onClick={() => createAndLoginUser()}

//             >
//               Register
//             </Button>
//             <Button
//               variant="secondary"
//               type="button"
//               size="lg"
//               onClick={() => {
//                 navigate("/login");
//               }}
//             >
//               Exit
//             </Button>
//           </Col>
//         </Row>
//       </Container>
//     </div>
//   );
// };

// export default Register;

