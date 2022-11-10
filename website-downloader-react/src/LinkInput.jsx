import React from 'react';

export default function LinkInput() {
	return (
		<>
			<div>
				<form>
					<label>
						Ссылка:
						<input type="text" name="link" />
					</label>
					<input type="submit" value="Submit" />
				</form>
			</div>
		</>
	);
}
