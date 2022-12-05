import React from 'react';
import './styles.css';

export default function LinkInput() {
	function sendLinkToServer() {
		let user = {
			name: 'John',
			surname: 'Smith',
		};
		const URL = 'http://localhost:8080/';

		let params = {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json;charset=utf-8',
			},
			body: JSON.stringify(user),
		};

		fetch(URL, params)
			.then((data) => {
				return data.json();
			})
			.then((res) => {
				console.log(res);
			})
			.catch((error) => {
				console.log(error);
			});
	}

	function sendLinkToServerGET() {

		// const URL = 'http://ya.ru/';

		// fetch(URL)
		// 	.then((data) => {
		// 		return data.json();
		// 	})
		// 	.then((res) => {
		// 		console.log(res);
		// 	})
		// 	.catch((error) => {
		// 		console.log(error);
		// 	});
	}



	return (
		<>
			<div className="linkInput">
				{/* <form action= 'http://localhost:8080/' method='POST'> */}
					<label>
						Ссылка:
						<input type="text" name="link" />
					</label>
					<button onClick={sendLinkToServerGET()}>Скачать</button>
				{/* </form> */}
			</div>
		</>
	);
}
