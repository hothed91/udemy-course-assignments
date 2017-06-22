var GreeterMessage = React.createClass({
	render: function () {
		var name = this.props.name;
		var message = this.props.message;
		return (
			<div>
				<h1>Hello {name}!</h1>
				<p>{message}</p>
			</div>
		);
	}
});

var GreeterForm = React.createClass({
	onFormSubmit: function (e) {
		e.preventDefault();

		var updates = {};
		var name = this.refs.name.value;
		var message = this.refs.message.value;

		if(name.length > 0) {
			this.refs.name.value = '';
			updates.name = name;
		}

		if(message.length > 0) {
			this.refs.message.value ='';
			updates.message = message;
		}

		this.props.oneNewData(updates);
	},
	render: function () {
		return (
			<form onSubmit={this.onFormSubmit}>
				<input type="text" ref="name" placeholder="Enter Name"/>
				<br/>
				<textarea placeholder="Enter Message" ref="message"></textarea>
				<button>Submit</button>
			</form>
		);
	}
});

var Greeter = React.createClass({
	getDefaultProps: function () {
		return {
			name: "React",
			message: "This is from the component"
		};
	},
	getInitialState: function () {
		return {
			name: this.props.name,
			message: this.props.message
		};
	},
	handleNewData: function (updates) {
		this.setState(updates);
	},
	render: function () {
		var name = this.state.name;
		var message = this.state.message;

		return (
			<div>
				<GreeterMessage name={name} message={message}/>
				<GreeterForm oneNewData={this.handleNewData}/>

			</div>
		);
	}
});

var name = "Kathleen";
var message = "Hello from component";

ReactDOM.render(
	<Greeter name={name} message={message}/>,
	document.getElementById('app')
);
