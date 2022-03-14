import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-login_cibernauta')
export class VistaLogin_cibernauta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 90%; height: 90%; align-self: center; align-items: center; flex-grow: 0; margin: 5%; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="vaadinButton">
    Button 
  </vaadin-button>
  <vaadin-text-field label="Label" placeholder="Placeholder" id="label"></vaadin-text-field>
  <vaadin-text-field label="Label" placeholder="Placeholder" id="label1"></vaadin-text-field>
  <a href="https://vaadin.com" id="a">Link</a>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
   <vaadin-button id="vaadinButton1">
     Button 
   </vaadin-button>
   <vaadin-button id="vaadinButton2">
     Button 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-items: baseline;">
   <vaadin-button id="vaadinButton3">
     Button 
   </vaadin-button>
   <h5 id="h5">Heading 5</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-items: baseline;">
   <vaadin-button id="vaadinButton4">
     Button 
   </vaadin-button>
   <h5 id="h51">Heading 5</h5>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
