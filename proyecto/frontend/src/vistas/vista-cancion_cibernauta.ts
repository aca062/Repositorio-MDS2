import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cancion_cibernauta')
export class VistaCancion_cibernauta extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 200px; align-items: center;">
  <img id="img" style="width: 150px; height: 150px; object-fit: contain" src="https://i.scdn.co/image/ab67616d0000b2733e0698e4ae5ffb82a005aeeb">
  <h5 id="h5" style="align-self: center;">Wishing Well</h5>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
