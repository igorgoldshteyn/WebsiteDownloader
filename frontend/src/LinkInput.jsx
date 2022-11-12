import React from 'react';
import './styles.css'


export default function LinkInput() {
	return (
		<>
			<div className='linkInput'>
				<form>
					<label>
						Ссылка:
						<input type="text" name="link" />
					</label>
					<input type="submit" value="Скачать" />
				</form>
			</div>
		</>
	);
}
